# Демопроект автоматизации тестирования API на reqres.in
<p align="center">
<img title="ReqresLogo" src="media/icons/Reqres_logo.png">

## :scroll: Содержание:

- [Используемый стек](#computer-используемый-стек)
- [Тест-кейсы](#heavy_check_mark-тест-кейсы)
- [Запуск автотестов](#arrow_forward-запуск-автотестов)
- [Сборка в Jenkins](#-сборка-в-jenkins)
- [Отчет о результатах тестирования в Allure Report](#-отчет-о-результатах-тестирования-в-allure-report)
- [Интеграция с Allure TestOps](#-интеграция-с-allure-testops)
- [Интеграция с Jira](#-интеграция-с-jira)
- [Интеграция с Telegram](#-интеграция-с-telegram)

## :computer: Используемый стек

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="media/icons/Intelij_IDEA.svg">
<img width="6%" title="Java" src="media/icons/Java.svg">
<img width="6%" title="Selenoid" src="media/icons/Selenoid.svg">
<img width="6%" title="Allure Report" src="media/icons/Allure_Report.svg">
<img width="5%" title="Allure TestOps" src="media/icons/AllureTestOps.svg">
<img width="6%" title="Gradle" src="media/icons/Gradle.svg">
<img width="6%" title="JUnit5" src="media/icons/JUnit5.svg">
<img width="6%" title="JUnit5" src="media/icons/RestAssured.svg">
<img width="6%" title="JUnit5" src="media/icons/GitHub.svg">
<img width="6%" title="Jenkins" src="media/icons/Jenkins.svg">
<img width="6%" title="Telegram" src="media/icons/Telegram.svg">
<img width="5%" title="Jira" src="media/icons/Jira.svg">
</p>

## :heavy_check_mark: Тест-кейсы
* Получение данных пользователя;
* Проверка получения списка ресурсов;
* Создание нового пользователя;
* Обновление данных пользователя;
* Удаление пользователя.

## :arrow_forward: Запуск автотестов

### Удаленный запуск тестов из терминала
```
gradle clean test
```
## <img width="4%" style="vertical-align:middle" title="Jenkins" src="media/icons/Jenkins.svg"> Сборка в Jenkins

Для запуска [сборки](https://jenkins.autotests.cloud/job/qa_guru_20_Diplom_API/) необходимо перейти в раздел <code>Собрать с параметрами</code>, указать нужные параметры и нажать кнопку <code>Собрать</code>.
<p align="center">
<img title="Jenkins Build" src="media/screenshots/job.png">
</p>

## <img width="4%" style="vertical-align:middle" title="Allure Report" src="media/icons/Allure_Report.svg"> Отчет о результатах тестирования в [Allure Report](https://jenkins.autotests.cloud/job/qa_guru_20_Diplom_API/)

### Основная страница отчета

<p align="center">
<img title="Allure Overview" src="media/screenshots/allureReport.png">
</p>

### Тест-кейсы

<p align="center">
<img title="Allure Overview" src="media/screenshots/allureReportSuites.png">

## <img width="4%" style="vertical-align:middle" title="Allure TestOps" src="media/icons/AllureTestOps.svg"> Интеграция с [Allure TestOps](https://allure.autotests.cloud/project/3647/dashboards)

### Dashboards

<p align="center">
<img title="Allure TestOps DashBoard" src="media/screenshots/testOps_dash.png">
</p>

### Тест-кейсы

<p align="center">
<img title="Allure TestOps testcase" src="media/screenshots/testOps_test.png">
</p>

## <img width="4%" style="vertical-align:middle" title="Jira" src="media/icons/Jira.svg"> Интеграция с [Jira](https://jira.autotests.cloud/browse/HOMEWORK-869)

Реализована интеграция <code>Allure TestOps</code> с <code>Jira</code>, в тикете отображается, какие тест-кейсы были написаны в рамках задачи и результат их прогона.

<p align="center">
<img title="Jira Task" src="media/screenshots/jira.png">
</p>

## <img width="4%" style="vertical-align:middle" title="Telegram" src="media/icons/Telegram.svg"> Интеграция с Telegram

После завершения сборки бот автоматически отправляет сообщение в <code>Telegram</code> с отчетом о прогоне тестов.

<p align="center">
<img width="70%" title="Telegram Notifications" src="media/screenshots/telegram.png">
</p>
