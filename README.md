
# rn-write-settings

## Getting started

`$ npm install rn-write-settings --save`

### Mostly automatic installation

`$ react-native link rn-write-settings`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `rn-write-settings` and add `RNWriteSettings.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNWriteSettings.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainApplication.java`
  - Add `import com.reactlibrary.RNWriteSettingsPackage;` to the imports at the top of the file
  - Add `new RNWriteSettingsPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-write-settings'
  	project(':react-native-write-settings').projectDir = new File(rootProject.projectDir, 	'../node_modules/rn-write-settings/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':rn-write-settings')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNWriteSettings.sln` in `node_modules/react-native-write-settings/windows/RNWriteSettings.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Write.Settings.RNWriteSettings;` to the usings at the top of the file
  - Add `new RNWriteSettingsPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNWriteSettings from 'rn-write-settings';

// TODO: What to do with the module?
RNWriteSettings;
```
  
