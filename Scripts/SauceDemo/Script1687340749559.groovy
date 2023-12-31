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

WebUI.openBrowser('https://www.saucedemo.com/')

WebUI.maximizeWindow()

for (i = 1; i <= 3; i++) {
    user = findTestData('user_list').getValue(1, i)
    pass = findTestData('user_list').getValue(2, i)

    WebUI.setText(findTestObject('Object Repository/username'), user)
    WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)
	
    WebUI.setText(findTestObject('Object Repository/pass'), pass)
    WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)
	
	WebUI.takeScreenshot('D:\\sekringsut\\katalon_gambar1.png') //Gambar 1
	WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/buttonlgn'))
    WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)
	
	WebUI.takeScreenshot('D:\\sekringsut\\katalon_gambar2.png') //Gambar 2
	WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/burger button'))
    WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)
	
    WebUI.takeScreenshot('D:\\sekringsut\\katalon_gambar3.png') //Gambar 3
	WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)
	
    WebUI.click(findTestObject('Object Repository/logout'))
    WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

	//cobangepushryan
	//sekarang dari QAnobu
}


