package com.loan.account.create;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateAccountComponent {

	private CreateAccountRepository accountRepository;
	
	private ProductRepository createProductRepository;
	
	private CustomerRepository customerRepository;
	
	
	private static final Logger logger = LoggerFactory.getLogger(CreateAccountComponent.class);

	@Autowired
	public CreateAccountComponent(CreateAccountRepository accountRepository,ProductRepository createProductRepository,CustomerRepository customerRepository) {
		this.accountRepository = accountRepository;
		this.createProductRepository =createProductRepository;
		this.customerRepository = customerRepository;
	}

	@Transactional
	public AccountCreate accountCreate(CreateAccountQuery query) throws Exception {
		Product product = createProductRepository.findByProductType(query.getProductType());
		Customer customer	= customerRepository.findByCustomerId(query.getCustomerId());
		customerValidation(query, product, customer);
		AccountCreate accountCreate = accountRepository.save(convertAccountCreateEntity(query));
		return accountCreate;
	}

	private void customerValidation(CreateAccountQuery query, Product product, Customer customer) throws Exception {
		if(product==null || customer==null) {
			throw new Exception("Product or Customer ");
		}
		if(query.getApprovedLoanAmount() < customer.getCreditScore()) {
			throw new Exception("Approved Loan Amount  should  not be greater than Credit Score  ");
		}
		if(query.getApprovedLoanAmount() > product.getMinLoanAmount() && query.getApprovedLoanAmount() < product.getMaxLoanAmount() ) {
			throw new Exception("Approved Loan Amount  should  not be greater than  Min and Max LoanAmount ");
		}
		if(query.getLoanTenure() > product.getMinLoanAmount() && query.getLoanTenure() < product.getMaxLoanTenure()) {
			throw new Exception("Approved Loan Amount  should  not be greater than  Min and Max   LoanTenure");
		}
	}
	
	@Transactional
	public void productCreate(ProductCreate query) {
		 createProductRepository.save(convertProductCreate(query));
	}
	
	@Transactional
	public void customerCreate(CustomerCreate query) {
		customerRepository.save(convertCustomerCreate(query));
		
	}
	
	private Customer convertCustomerCreate(CustomerCreate query) {
		Customer customer = new Customer();
		customer.setSocialsecurityId(query.getSocialSecuirtyId());
		customer.setCreditScore(query.getCreditScore());
		customer.setCustomerId(query.getCustomerID());
		customer.setKeyStatus(query.getKycStatus());
		return customer;
	}

	private Product convertProductCreate(ProductCreate query) {
		Product product = new Product();
		product.setProduct_ID(query.getProduct_ID());
		product.setInterestRate(query.getInterestRate());
		product.setMaxLoanAmount(query.getMaxLoanAmount());
		product.setMinLoanTenure(query.getMinLoanTenure());
		product.setMaxLoanTenure(query.getMaxLoanTenure());
		product.setMinLoanAmount(query.getMinLoanAmount());
		product.setProductType(query.getProductType());
		product.setProductStatus(query.getProductStatus());
		return product;
	}

	private AccountCreate convertAccountCreateEntity(CreateAccountQuery query) {
		AccountCreate accountCreate = new AccountCreate();
		accountCreate.setCustomerId(query.getCustomerId());
		accountCreate.setProductType(query.getProductType());
		accountCreate.setAccountName(query.getAccountName());
		accountCreate.setApprovedLoanAmount(query.getApprovedLoanAmount());
		accountCreate.setArrears(query.getArrears());
		accountCreate.setCharges(query.getCharges());
		accountCreate.setDisbursedLoanAmount(query.getDisbursedLoanAmount());
		accountCreate.setFirst_Next_InstallmentAmount(query.getFirst_Next_InstallmentAmount());
		accountCreate.setFirstNextInstallmentDate(query.getFirstNextInstallmentDate());
		accountCreate.setInterestRate(query.getInterestRate());
		accountCreate.setLoanTenure(query.getLoanTenure());
		return accountCreate;
	}

}
