package kodlama.io.Devs.businness.concretes.validate.abstracts;

import kodlama.io.Devs.entity.ProgrammingLanguage;

public interface IEntityValidate 
{
	public default int getId() {return 0;};
	public default String getName() {return null;}
	public default ProgrammingLanguage getProgrammingLanguage(){return null;}
}
