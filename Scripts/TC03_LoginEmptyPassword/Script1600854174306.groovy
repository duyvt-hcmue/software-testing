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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.webpagetest.org/')

WebUI.click(findTestObject('Object Repository/TC03_LoginEmptyPassword/Page_WebPageTest - Website Performance and _5bfcc6/a_Login'))

WebUI.setText(findTestObject('Object Repository/TC03_LoginEmptyPassword/Page_WebPagetest Forums - Login/input_Username_username'), 
    'vtd')

WebUI.click(findTestObject('Object Repository/TC03_LoginEmptyPassword/Page_WebPagetest Forums - Login/input_Remember me_submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/TC03_LoginEmptyPassword/Page_WebPagetest Forums - Login/div_Please correct the following errors bef_8eda1f'), 
    0)

WebUI.closeBrowser()

