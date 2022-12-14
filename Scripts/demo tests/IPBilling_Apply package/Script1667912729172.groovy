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

WebUI.callTestCase(findTestCase('demo tests/logincase'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/span_IP Billing'))

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/span_IP Billing'))

WebUI.click(findTestObject('Object Repository/Page_ROBINHome/a_IP Bills'))

WebUI.setText(findTestObject('Object Repository/Page_IP Bills/input_IP Bills_phWLFormsearch'), 'mrn-890.89')

WebUI.click(findTestObject('Object Repository/Page_IP Bills/span_Search'))

WebUI.click(findTestObject('Object Repository/Page_IP Bills/a_KJHSAGA sdgjaj RTYUIO'))

WebUI.click(findTestObject('IP Package/span_Apply Package'))

WebUI.click(findTestObject('IP Package/span_Total-SAR_ui-chkbox-icon ui-icon ui-icon-blank ui-c'))

WebUI.click(findTestObject('IP Package/span_Package Deal_ui-button-icon-left ui-icon ui-c fa fa-th-list'))

WebUI.click(findTestObject('IP Package/span_Dental_ui-button-icon-left ui-icon ui-c ui-icon-circle-close'))

WebUI.click(findTestObject('IP Package/span_Apply'))

WebUI.click(findTestObject('IP Package/span_Yes'))

WebUI.closeBrowser()

