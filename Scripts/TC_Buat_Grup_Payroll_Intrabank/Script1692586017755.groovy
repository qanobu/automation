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

WebUI.click(findTestObject('Buat Grup Payroll Intrabank/Menu_Daftar_Gaji'))

WebUI.click(findTestObject('Buat Grup Payroll Intrabank/Menu_Sesama_Mata_Uang'))

WebUI.click(findTestObject('Buat Grup Payroll Intrabank/Button_Buat_Grup_Payroll'))

WebUI.click(findTestObject('Buat Grup Payroll Intrabank/Field_Grup_Transfer'))

WebUI.setText(findTestObject('Buat Grup Payroll Intrabank/Field_Nama_Grup'), '')

WebUI.setText(findTestObject('Buat Grup Payroll Intrabank/Field_Berita_Payroll'), 'tekoktek')

WebUI.click(findTestObject('Buat Grup Payroll Intrabank/RadioButton_Intrabank'))

WebUI.setText(findTestObject('Buat Grup Payroll Intrabank/Field_Nomor_Rekening'), '')

WebUI.setText(findTestObject('Buat Grup Payroll Intrabank/Field_Nominal_Transfer'), '')

WebUI.setText(findTestObject('Buat Grup Payroll Intrabank/Field_Berita'), '')

WebUI.click(findTestObject('Buat Grup Payroll Intrabank/Checkbox_Email'))

WebUI.setText(findTestObject('Buat Grup Payroll Intrabank/Field_Email'), '')

WebUI.click(findTestObject('Buat Grup Payroll Intrabank/Button_Tambah_Rekening_Baru'))

WebUI.delay(2)

WebUI.click(findTestObject('Buat Grup Payroll Intrabank/Button_Simpan_Grup'))

