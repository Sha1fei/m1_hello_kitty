# HelloKitty

## Сборка

```bash
./gradlew assembleDebug
```

APK будет в `app/build/outputs/apk/debug/HelloKitty.apk`

## Установка

```bash
adb install -r app/build/outputs/apk/debug/HelloKitty.apk
```

## Состав проекта

- **`MainActivity.kt`** — главный экран: поле ввода имени кота, кнопка с изображением Hello Kitty и приветственный текст
- **`activity_main.xml`** — разметка: `EditText` (ввод имени), `ImageButton` (кнопка с картинкой), `TextView` (вывод приветствия)
- **`pinkhellokitty.jpg`** — изображение для кнопки
- **`build.gradle.kts`** — конфигурация сборки (compileSdk 37, targetSdk 36)
- **`AndroidManifest.xml`** — манифест приложения
