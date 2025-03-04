import { NativeModules } from 'react-native';

const { MyModule } = NativeModules;

const myNativeModule = {
  performTask: async () => {
    try {
      const result = await MyModule.performTask();
      return result;
    } catch (error) {
      throw new Error('Error performing task: ' + error.message);
    }
  },
};

export default myNativeModule;