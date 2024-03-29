package Envirnoment.Setup;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ConfigReader
{
	Properties pro;
	public ConfigReader()
	{
		File file = new File("C:\\Users\\b.n.3\\EndToEndDigitalization\\src\\main\\java\\ObjectRepo\\BrowserSetting_Objects.properties");
		try {
			FileInputStream FIS = new FileInputStream(file);
			pro = new Properties();
			pro.load(FIS);
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public String getBrowser()
	{
		return pro.getProperty("browser");
	}
	public String getchromePath()
	{
	return pro.getProperty("chromePath");
	}
	public String getemail()
	{
		return pro.getProperty("Login_email");
	}
	public String getpassword()
	{
		return pro.getProperty("Login_password");
	}
	public String getEnter() 
	{
		return pro.getProperty("Login_Enter");
	}
	public String getClientClick()
	{
	return pro.getProperty("client_Click");
	}
	public String getSelectClient()
	{
		return pro.getProperty("selectClient");
	}
	public String getDeliveryClick()
	{
		return pro.getProperty("delivery_Click");
	}
	public String getSelectDelivery()
	{
		return pro.getProperty("selectDelivery");
	}
	public String getProductMixtureClick()
	{
		return pro.getProperty("productMixtureClick");
	}
	public String getProductMixtureSelect()
	{
		return pro.getProperty("productMixtureSelect");
	}
	//Shopping Cart Objects 
	public String getgoCart() 
	{
		return pro.getProperty("goCart");
	}
	public String getClearCart()
	{
		return pro.getProperty("clearCart");
	}
	public String getcontinueBuying()
	{
		return pro.getProperty("continueBuying");
	}
	public String getProductLink()
	{
		return pro.getProperty("ProductLink");
	}
	public String getsearchProduct()
	{
		return pro.getProperty("searchProduct");
	}
	public String getproductList()
	{
		return pro.getProperty("productList");
	}
	public String getaddQty()
	{
		return pro.getProperty("addQty");
	}
	public String getaddToCart()
	{
		return pro.getProperty("addToCart");
	}public String getmoveToShoppingCart()
	{
		return pro.getProperty("moveToShoppingCart");
	}
	public String getverifyShoppingCartTitle()
	{
		return pro.getProperty("verifyShoppingCartTitle");
	}
	public String getaddPurchaseOrder()
	{
		return pro.getProperty("addPurchaseOrder");
	}
	public String getconfirmation_Popup()
	{
		return pro.getProperty("confirmation_Popup");
	}
	public String gettruckwrapper()
	{
		return pro.getProperty("truckwrapper");
	}
	public String getcheckOut()
	{
		return pro.getProperty("checkOut");
	}
	public String getBox()
	{
		return pro.getProperty("box");
	}
	public String getBed()
	{
		return pro.getProperty("bed");
	}
	public String getPallet()
	{
		return pro.getProperty("pallet");
	}
	//Purchase Summary page
	public String getbillingSection()
	{
		return pro.getProperty("billingSection");
	}
	
	public String getdeliveryAddress()
	{
		return pro.getProperty("deliveryAddress");
	}
	
	public String getdeliveryDetails()
	{
		return pro.getProperty("deliveryDetails");
	}
	
	public String getexcelSummary()
	{
		return pro.getProperty("excelSummary");
	}
	
	public String getpdfSummary()
	{
		return pro.getProperty("pdfSummary");
	}
	
	public String getsubTotal()
	{
		return pro.getProperty("subTotal");
	}
	
	public String getagreementCheckbox()
	{
		return pro.getProperty("agreementCheckbox");
	}
	
	public String getmakeOrder()
	{
		return pro.getProperty("makeOrder");
	}
	
	public String getcheckPriceHeader()
	{
		return pro.getProperty("checkPriceHeader");
	}
	
	public String getarrivalDate()
	{
		return pro.getProperty("arrivalDate");
	}
	
	public String getverifyPriceSection()
	{
		return pro.getProperty("verifyPriceSection");
	}
	
	public String getsubTotalSection()
	{
		return pro.getProperty("subTotalSection");
	}
	
	public String gettaxSection()
	{
		return pro.getProperty("taxSection");
	}
	
	public String getgrandTotal()
	{
		return pro.getProperty("grandTotal");
	}
	
	public String getorderSuccessMessage()
	{
		return pro.getProperty("orderSuccessMessage");
	}
	
	public String getreturnStore()
	{
		return pro.getProperty("returnStore");
	}
	
	public String getgoOut()
	{
		return pro.getProperty("goOut");
	}
	
}
