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

WebUI.click(findTestObject('Object Repository/TC05_UseTestedFunctionalityOfSite/Page_WebPageTest - Website Performance and _5bfcc6/a_Login'))

WebUI.setText(findTestObject('Object Repository/TC05_UseTestedFunctionalityOfSite/Page_WebPagetest Forums - Login/input_Username_username'), 
    'vtd')

WebUI.setEncryptedText(findTestObject('Object Repository/TC05_UseTestedFunctionalityOfSite/Page_WebPagetest Forums - Login/input_()_password'), 
    'ISvJhDV+0iO0sg/NmSkSwg==')

WebUI.click(findTestObject('Object Repository/TC05_UseTestedFunctionalityOfSite/Page_WebPagetest Forums - Login/input_Remember me_submit'))

WebUI.setText(findTestObject('Object Repository/TC05_UseTestedFunctionalityOfSite/Page_WebPageTest - Website Performance and _5bfcc6/input_Traceroute_url'), 
    'fb.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/TC05_UseTestedFunctionalityOfSite/Page_WebPageTest - Website Performance and _5bfcc6/select_Moto G (gen 4)Moto G (gen 6)Alcatel _73e413'), 
    'ec2-ap-northeast-2-catchpoint', true)

WebUI.click(findTestObject('Object Repository/TC05_UseTestedFunctionalityOfSite/Page_WebPageTest - Website Performance and _5bfcc6/button_Custom Hero Element Selectors_g-reca_fcd9f4'))

WebUI.click(findTestObject('Object Repository/TC05_UseTestedFunctionalityOfSite/Page_WebPageTest Content Breakdown - Seoul _cc0266/a_Logout'))

WebUI.closeBrowser()

