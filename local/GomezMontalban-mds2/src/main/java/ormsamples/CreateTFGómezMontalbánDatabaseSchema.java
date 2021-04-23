/**
 * Licensee: David(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateTFGómezMontalbánDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(basededatos.TFGómezMontalbánPersistentManager.instance());
			basededatos.TFGómezMontalbánPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
