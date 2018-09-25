
# rn-write-settings

## Getting started

`$ npm install rn-write-settings --save`

### Mostly automatic installation

`$ react-native link rn-write-settings`

### Manual installation

#### Android

1. Open up `android/app/src/main/java/[...]/MainApplication.java`
  - Add `import com.reactlibrary.RNWriteSettingsPackage;` to the imports at the top of the file
  - Add `new RNWriteSettingsPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':rn-write-settings'
  	project(':rn-write-settings').projectDir = new File(rootProject.projectDir, 	'../node_modules/rn-write-settings/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':rn-write-settings')
  	```

## Permissions
  * Open up `android/app/src/main/AndroidManifest.xml` and add the `WRITE_SETTINGS` permission.
  ```xml
  <uses-permission android:name="android.permission.WRITE_SETTINGS"/>
  ```

## Usage
```javascript
import RNWriteSettings from 'rn-write-settings';

// A system window for the user configure this permission should appear.
RNWriteSettings.checkPermission();
```
  
