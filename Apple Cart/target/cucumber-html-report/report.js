$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Order macbook with accessories.feature");
formatter.feature({
  "line": 1,
  "name": "Order macbook with accessories",
  "description": "",
  "id": "order-macbook-with-accessories",
  "keyword": "Feature"
});
formatter.before({
  "duration": 601486118,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the url \"https://www.apple.com/uk/\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.apple.com/uk/",
      "offset": 9
    }
  ],
  "location": "Stepdefinitions.the_url(String)"
});
formatter.result({
  "duration": 19416907330,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "A MacBook \"15\" with accessories can be ordered on the website",
  "description": "",
  "id": "order-macbook-with-accessories;a-macbook-\"15\"-with-accessories-can-be-ordered-on-the-website",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I go to the url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I choose a MacBook Pro with the following features and accessories",
  "rows": [
    {
      "cells": [
        "Option",
        "Specification"
      ],
      "line": 9
    },
    {
      "cells": [
        "Screen",
        "15"
      ],
      "line": 10
    },
    {
      "cells": [
        "Processor",
        "2.9GHz"
      ],
      "line": 11
    },
    {
      "cells": [
        "Memory RAM",
        "16GB"
      ],
      "line": 12
    },
    {
      "cells": [
        "Colour",
        "Silver"
      ],
      "line": 13
    },
    {
      "cells": [
        "Software",
        "Logic Pro X"
      ],
      "line": 14
    },
    {
      "cells": [
        "Display adapter",
        "USB-C to USB Adapter"
      ],
      "line": 15
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I can place an order for it.",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinitions.i_go_to_the_url()"
});
formatter.result({
  "duration": 4256280680,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinitions.i_choose_a_MacBook_Pro_with_the_following_features_and_accessories(DataTable)"
});
formatter.result({
  "duration": 41869580364,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinitions.i_can_place_an_order_for_it()"
});
formatter.result({
  "duration": 42764,
  "status": "passed"
});
formatter.after({
  "duration": 17734890,
  "status": "passed"
});
formatter.before({
  "duration": 774682396,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "the url \"https://www.apple.com/uk/\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.apple.com/uk/",
      "offset": 9
    }
  ],
  "location": "Stepdefinitions.the_url(String)"
});
formatter.result({
  "duration": 4301441,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "The correct price and VAT are displayed for a MacBook 15 with accessories",
  "description": "",
  "id": "order-macbook-with-accessories;the-correct-price-and-vat-are-displayed-for-a-macbook-15-with-accessories",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "when I choose the following items:",
  "rows": [
    {
      "cells": [
        "Option",
        "Price in £"
      ],
      "line": 21
    },
    {
      "cells": [
        "MacBook Pro and software",
        "3168.99"
      ],
      "line": 22
    },
    {
      "cells": [
        "Display adapter",
        "19.00"
      ],
      "line": 23
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "I proceed to the checkout",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "a total price of \"£3,187.99\" will be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "\"£531.34\" will be listed for VAT.VAT",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinitions.when_I_choose_the_following_items(DataTable)"
});
formatter.result({
  "duration": 4713532832,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d73.0.3683.103)\n  (Driver info: chromedriver\u003d2.36.540470 (e522d04694c7ebea4ba8821272dbef4f9b818c91),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027HOME\u0027, ip: \u0027192.168.0.4\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_211\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.36.540470 (e522d04694c7eb..., userDataDir: C:\\Users\\Sundeep\\AppData\\Lo...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 73.0.3683.103, webStorageEnabled: true}\nSession ID: 183bf412850a5d399a93d52fc978694a\n*** Element info: {Using\u003dxpath, value\u003d(//a[@data-autom\u003d\u0027bag-item-name\u0027])}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:344)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementsByXPath(RemoteWebDriver.java:423)\r\n\tat org.openqa.selenium.By$ByXPath.findElements(By.java:348)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:305)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElements(DefaultElementLocator.java:85)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementListHandler.invoke(LocatingElementListHandler.java:36)\r\n\tat com.sun.proxy.$Proxy16.size(Unknown Source)\r\n\tat com.apple.pages.BagPage.getPricesForAllItems(BagPage.java:46)\r\n\tat com.apple.definations.Stepdefinitions.when_I_choose_the_following_items(Stepdefinitions.java:71)\r\n\tat ✽.Given when I choose the following items:(Order macbook with accessories.feature:20)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Stepdefinitions.i_proceed_to_the_checkout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "£3,187.99",
      "offset": 18
    }
  ],
  "location": "Stepdefinitions.a_total_price_of_will_be_displayed(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "£531.34",
      "offset": 1
    }
  ],
  "location": "Stepdefinitions.will_be_listed_for_VAT_VAT(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 3877797,
  "status": "passed"
});
});