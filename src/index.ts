import { NativeModules } from 'react-native';

const { MyLibrary } = NativeModules;

export const initializeLibrary = async () => {
  await MyLibrary.initialize();
};

export const someNativeFunction = async (param) => {
  return await MyLibrary.someNativeFunction(param);
};

export default MyLibrary;