package Utilities;

public class PageObjects {

	//Initiate browser
	public static String url() {
		return "https://identity.getpostman.com/login";
	}

	public static String Username() {
		return "//input[@id='username']";
	}

	public static String Password() {
		return "//input[@id='password']";
	}

	public static String loginBtn() {
		return "//Button[@id='sign-in-btn']";
	}

	public static String workSpaceTab() {
		return "//div[@class='workspace-switcher__name']";
	}

	public static String myWorkSpace() {
		return "//span[contains(text(),'My Workspace')]";
	}

	public static String eCommerceQA() {
		return "//div[contains(text(),'eCommerce - QA - v2.1')]";
	}

	public static String eCommerce() {
		return "//div[@class='collection-sidebar-list-item__folder__head__meta']//div[contains(text(),'eCommerce')]";
	}

	//Immediate payment
	public static String immediatePayment() {
		return "//div[@title= 'Initiate Immediate Payment']";
	}

	public static String sendBtn() {
		return "//div[@class='btn']//span[contains(text(),'Send')]";
	}

	public static String paymentPages() {
		return "//div[@class='view-line'][9]";
	}

	public static String singlePayment() {
		return "//p[contains(text(),'Single Payment')]";
	}

	public static String singlepaymentCard() {
		return "//div[@id='page-method-id-0']";
	}

	public static String recurringpaymentCard() {
		return "//div[@id='page-method-id-2']";
	}

	public static String continueToPayBtn() {
		return "//button[@name='3D-Secure-Select']";
	}

	public static String cvvText() {
		return "//div[@class='payment-page-methods-content']//p";
	}

	public static String cvvInput() {
		return "//input[@id='cardSelectedCVV']";
	}

	public static String payBtn() {
		return "//button[@name='3D-Secure-Pay']";
	}

	public static String secureBtn() {
		return "//button[@id='submit']";
	}

	public static String lastResponse() {
		return "//h1";
	}

	//Split payments
	public static String splitPayment() {
		return "//p[contains(text(),'Split Payment')]";
	}

	public static String splitPaymentCard1() {
		return "//div[@class='payment-page-methods-list list-payment-methods append-split-payments none']//div[@id='page-method-id-0']";
	}

	public static String splitPaymentCard2() {
		return "//div[@class='payment-page-methods-list list-payment-methods append-split-payments none']//div[@id='page-method-id-1']";
	}

	public static String amount() {
		return "//input[@type='text']";
	}

	public static String cvvTextInput() {
		return "//input[@type='tel']";
	}

	public static String doneBtn() {
		return "//span[@class='done']";
	}

	public static String scndCardDoneBtn() {
		return "//div//span[contains(text(),'Done')]";
	}

	public static String splitPaymentPayBtn() {
		return "//button[@class='multi-tender-pay column pay-button']";
	}

	public static String secureContinueBtn() {
		return "//button[@id='submitButton']";
	}

	//Delayed payment
	public static String delayedPayment() {
		return "//div[@title= 'Initiate Delayed Payment']";
	}

	//Recurring payment
	public static String recurringPayment() {
		return "//div[@title= 'Initiate Recurring Payment Working']";
	}

	/*mCommerce pageobjects*/

	public static String mCommerceQA() {
		return "//div[contains(text(),'mCommerce - v2.1 new QA sov')]";
	}

	public static String authenitcateTab() {
		return "//div[contains(text(),'Authenticate Token')]";
	}

	public static String environmentSelect() {
		return "//input[@title='No Environment']";
	}

	public static String environment() {
		return "//div[@title='mCommerce']";
	}

	public static String initiateAuthenticateToken() {
		return "//div[@title= 'Initiate Authenticate Token']";
	}

	public static String paymentToken() {
		return "//div[@class='view-line'][2]";
	}

	public static String copyToken(String paymentToken) {
		return "//div[@class='view-line'][2]//span[contains(text(),'"+paymentToken+"')]";
	}

	public static String closeTab() {
		return "//div[@class='requester-tab__fade']";
	}



	public static String paymentAuthTab() {
		return "//div[contains(text(),'Payment - Auth - SOV')]";	
	}

	public static String AuthRequest() {
		return "//div[@title= 'Auth Request']";	
	}

	public static String authSplitView() {
		return "//i[@class='pm-icon pm-icon-xs pm-icon-normal']";
	}

	public static String bodyIcon() {
		return "//div[@class='tab-text-wrapper']//span[contains(text(),'Body')]";
	}

	public static String paymentTokenscnd() {
		return "//div[@class='view-line'][6]";
	}

	public static String finAdviceTab() {
		return "//div[@title= 'Financial Advice']";
	}

	public static String statusCode() {
		return "[@class='response-meta-status-code']";
	}

	public static String sendDownload() {
		return "//div[@class='btn']//i[@class='IconWrapper__IconContainer-gnjn48-0 gkhcSN dropdown-caret']";
	}
	//*[@id='app-root']/div/div/div[6]/div[1]/div[1]/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div[1]/div[1]/div/div[2]/div/div[2]/div/div/div/div/div[2]/i

	public static String sendDownloadBtn() {
		return "//div[@class= 'dropdown-menu-item dropdown-menu-item--send-and-download']";
	}

	public static String didgitalWalletTab() {
		return "//div[contains(text(),'Digital Wallet Management')]";
	}

	public static String listTokens() {
		return "//div[@title= 'List Tokens']";
	}

	public static String paymentAuthCardTab() {
		return "//div[contains(text(),'Payment - Auth - Card')]";	
	}

	public static String failToLogin() {
		return "//div[@id = 'notification-div']";
	}

	public static String splitPaymentAddCard() {
		return "//div[@class='split-payment-add-button']//button";
	}

	public static String cardName() {
		return "//input[@id='nameOfCard']";
	}

	public static String cardNumber() {
		return "//input[@id='cardNumber']";
	}

	public static String cardExpiryYear() {
		return "//div[@class='payment-item card-expiry-year']//select";
	}

	public static String yearOption() {
		return "//option[@id='2022']";
	}

	public static String cardExpiryDate() {
		return "//div[@class='payment-item card-expiry-date']//select";
	}

	public static String dateOption() {
		return "//option[@value='October']";
	}

	public static String slpitPaymentCVV() {
		return "//input[@id='cardCvv']";
	}

	public static String addCardAmount() {
		return "//input[@id='cardAmountSplitPayment']";
	}

	public static String saveCardCheckBox() {
		return "//input[@id='saveCardCheckbox']";
	}

	public static String  cardAlis() {
		return "//input[@id='cardAlias']";
	}

	public static String addCardDone() {
		return "//button[@class='add-split-payment-card']";
	}

	public static String removeCard() {
		return "//div[@class='payment-page-methods-remove-card'][1]";
	}

	public static String removeCardBtn() {
		return "//div[@class='modal-inner-button']//btn[@class='column remove-button']";
	}

	public static String singlePaymentAddCard() {
		return "//div[@class='payment-page-methods-content']//p[contains(text(),'Credit / debit card')]";
	}

	public static String dateOptionSinglePayment() {
		return "//option[@value='April']";
	}

	public static String yearOptionSinglePayment() {
		return "//option[@id='2024']";
	}

	public static String removeCardDoneBtn() {
		return "//button[contains(text(),'Done')]";
	}

}
