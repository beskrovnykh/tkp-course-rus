## Установка Java SDK и Eclipse

Установите Java SDK
1. Перейдите по [ссылке](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) и выберите последнюю версию Java SE Development Kit, совместимую с вашей операционной системой
2. Поставьте галочку Accept License Agreement
3. Скачайте архив и следуйте указаниям установщика

После этого перейдите к установке среды разработки Eclipse
1. В зависимости от разрядности операционной системы скачайте архив [x86](http://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/oxygen/R/eclipse-java-oxygen-R-win32.zip)/[x64](http://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/oxygen/R/eclipse-java-oxygen-R-win32-x86_64.zip)
2. Переместите архив в папку _Program Files_ и распакуйте его 
3. Cоздайте ссылку для файла _eclipse.exe_ на рабочем столе

## Настройка Eclipse

### Настройка кодировки 

В русскоязычных системах Windows текстовые файлы, импортированные в среду Eclipse, имеют кодировку Windows-1251. Так как текстовые файлы учебного проекта имеют кодировку UTF-8, использование настроек по умолчанию приводит к неправильному отображению текстовых файлов.Для того чтобы это исправить

1. Перейдите в меню общих настроек **Window** - **Preferences** - **General**
2. В этом окне найдите пункт **Text file encoding**, выберите опцию **Other** и поменяйте кодировку на UTF-8
![3-howto-set-utf8-by-default](https://user-images.githubusercontent.com/12078509/31885208-e7beec84-b819-11e7-9bbc-4352db35834d.png)
3. Нажмите **Apply and Close**

### Настройка проверки правописания

По умолчанию в Eclipse отсутствует словарь проверки правописания русских слов. Поэтому любой текст, написанный на русском, будет подчеркнут волнистой линией. Чтобы это исправить следует
* Либо совсем отключить проверку правописания
* Либо установить словарь русских слов

#### Для отключения проверки правописания
1. Перейдите в меню редактирования правописания. Для этого сначала откройте окно с настройками **Window** - **Preferences**, а затем в поле с текстом **type filter text** введите слово **Spelling**
2. Отключите опцию **Enable spell checking**
![2-howto-disable-spellcheck](https://user-images.githubusercontent.com/12078509/31885206-e796b3ea-b819-11e7-9013-5efa24ffe76e.png)
3. Нажмите **Apply and Close**

#### Для установки словаря проверки правописания русских слов
1. Скачайте [архив](https://dikmax.name/media/russian.dic.zip) и извлеките из него файл _russian.dic_
2. Перейдите в [меню редактирования правописания](https://github.com/beskrovnykh/tkp-course-rus#Для-отключения-проверки-правописания)
3. Нажамите **Browse…** и выберите извлеченный файл
![1-howto-add-russian-dictionary](https://user-images.githubusercontent.com/12078509/31885205-e76b00ec-b819-11e7-905e-958b52b73809.png)
4. Нажмите **Apply and Close**

## Начало работы

* Если вы имели опыт работы с `git`, то используйте команду
```sh 
   git clone https://github.com/beskrovnykh/tkp-course-rus.git
```
* Если нет, то скачайте [архив](https://github.com/beskrovnykh/tkp-course-rus/archive/master.zip) и распакуйте его в папку с вашими проектами

Для того чтобы начать выполнять задания откройте учебный проект в Eclipse. Для этого
1. Перейдите в меню импорта проектов **File** - **Import**  
![4-howto-import-step1](https://user-images.githubusercontent.com/12078509/31885209-e7e3f178-b819-11e7-88bc-632cae4efa24.png)
2. Выберите **Maven** - **Existing Maven Projects**, нажмите **Next**
![5-howto-import-step2](https://user-images.githubusercontent.com/12078509/31885210-e8087bec-b819-11e7-83d5-9c2a021970c1.png)
3. Выберите папку с учебным проектом и урок, над которым собираетесь работать
![6-howto-import-step3](https://user-images.githubusercontent.com/12078509/31885211-e82e3cd8-b819-11e7-9f4e-6f059f640a4e.png)
4. Нажмите **Finish**

***

Если в процессе установки вы столкнулись с трудностями или нашли ошибку, пожалуйста, оставьте ваше сообщение [здесь](https://github.com/beskrovnykh/tkp-course-rus/issue).

Успехов!
