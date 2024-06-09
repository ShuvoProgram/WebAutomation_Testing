from selenium import webdriver
from selenium.webdriver.support.select import Select
# from selenium.webdriver.chrome.service import Service
# from webdriver_manager.chrome import ChromeDriverManager
from selenium.webdriver.common.by import By
import time

driver = webdriver.Chrome()
driver.get("https://www.saucedemo.com/")


#Signin
driver.find_element(By.XPATH, "//input[@id='user-name']").send_keys("standard_user")
driver.find_element(By.XPATH, "//input[@id='password']").send_keys("secret_sauce")
time.sleep(3)
driver.find_element(By.XPATH, "//input[@id='login-button']").click()
time.sleep(5)

#Filter Price
static_dropdown = Select(driver.find_element(By.XPATH, "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[2]/div[1]/span[1]/select[1]"))
static_dropdown.select_by_value("lohi")

#Add items
driver.find_element(By.XPATH, "//button[@id='add-to-cart-sauce-labs-backpack']").click()
driver.find_element(By.XPATH, "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']").click()
time.sleep(5)

#Checkout
driver.find_element(By.XPATH, "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]").click()
time.sleep(3)
item1 = driver.find_element(By.ID, "item_4_title_link").text
item2 = driver.find_element(By.ID, "item_3_title_link").text

driver.find_element(By.XPATH, "//button[@id='checkout']").click()
time.sleep(3)



#Payment
driver.find_element(By.XPATH, "//input[@id='first-name']").send_keys("Akib")
driver.find_element(By.XPATH, "//input[@id='last-name']").send_keys("Rahman")
driver.find_element(By.XPATH, "//input[@id='postal-code']").send_keys("007")
time.sleep(3)
driver.find_element(By.XPATH, "//input[@id='continue']").click()
time.sleep(5)
driver.find_element(By.XPATH, "//button[@id='finish']").click()
time.sleep(5)
driver.find_element(By.XPATH, "//button[@id='back-to-products']").click()
time.sleep(3)

#Logout
driver.find_element(By.XPATH, "//button[@id='react-burger-menu-btn']").click()
time.sleep(3)
driver.find_element(By.XPATH, "//a[@id='logout_sidebar_link']").click()
time.sleep(3)

driver.quit()

print("You bought a ",item1,"and a ",item2)
