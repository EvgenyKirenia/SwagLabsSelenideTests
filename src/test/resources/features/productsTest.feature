# language: ru
# encoding: UTF-8
@test
Функциональность: Работа с товарами

  @products
  Сценарий: Проверка отображения товаров
    Дано открыт сайт "https://www.saucedemo.com/"
    И пользватель выполнил вход в систему
    Тогда тогда на странице товаров отображаеться 6 товаров

  @price
  Структура сценария: Провека цены товара <productName>
    Дано открыт сайт "https://www.saucedemo.com/"
    И пользватель выполнил вход в систему
    Когда пользователь нажимает на ссылку "<productName>"
    Тогда цена товара равна "<productPrice>"
    Примеры:
      | productName                       | productPrice |
      | Sauce Labs Backpack               | 29.99        |
      | Sauce Labs Bike Light             | 9.99         |
      | Sauce Labs Bolt T-Shirt           | 15.99        |
      | Sauce Labs Fleece Jacket          | 49.99        |
      | Sauce Labs Onesie                 | 7.99         |
      | Test.allTheThings() T-Shirt (Red) | 15.99        |



