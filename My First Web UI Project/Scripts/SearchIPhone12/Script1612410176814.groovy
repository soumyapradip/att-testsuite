import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// open browser
WebUI.openBrowser("https://www.att.com/")

// Set Text
WebUI.setText(findTestObject('Object Repository/SearchIphone12/Page_ATT Official Site - Unlimited Data Plans, Internet Service,  TV/input_Search_q'), "Iphone12")


// 	click
WebUI.click(findTestObject('Object Repository/SearchIphone12/Page_ATT Official Site - Unlimited Data Plans, Internet Service,  TV/svg'))

// click
WebUI.click( findTestObject('Object Repository/SearchIphone12/Page_Results for Iphone12 - ATT Search/span_Apple iPhone 12 - 64GB - Blue'))
 
 
// click
WebUI.click(findTestObject('Object Repository/SearchIphone12/Page_Apple iPhone 12 64 GB in Blue - 700 Off - ATT/div_No trade-in'))



// close browser
WebUI.closeBrowser()

	