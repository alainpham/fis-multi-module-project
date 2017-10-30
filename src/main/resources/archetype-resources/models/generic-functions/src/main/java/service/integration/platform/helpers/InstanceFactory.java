#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package service.integration.platform.helpers;

public class InstanceFactory {
	
	public static Object createObject(String className) throws ClassNotFoundException, InstantiationException, IllegalAccessException{

		Class classDefinition = Class.forName(className);
		Object object = classDefinition.newInstance();
		return object;

	}
}
