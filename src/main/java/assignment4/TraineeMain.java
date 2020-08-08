package assignment4;

import java.util.*;


public class TraineeMain {
	Map<Integer,Trainee> store=new HashMap<>();
	Set<CsTrainee> cstrainee=new HashSet<>();
	Set<EceTrainee> ecetrainee=new HashSet<>();
	public static void main(String[] args) {
		TraineeMain demo=new TraineeMain();
		demo.runUi();
	}
	public void runUi() {
		CsTrainee cs=new CsTrainee(1,"bhanu",5);
		EceTrainee ece=new EceTrainee(2,"chinni","multimeter");
		store.put(cs.getId(),cs);
		store.put(ece.getId(), ece);
		for(Trainee trainee:store.values()) {
			Trainee traineedetails=(Trainee) trainee;
			boolean iscs= traineedetails instanceof CsTrainee;
			if(iscs) {
				cstrainee.add((CsTrainee) traineedetails);
			}
			else {
				ecetrainee.add((EceTrainee) traineedetails);
			}
		}
		System.out.println("*******diplay cstrainees******");
		for(CsTrainee csset:cstrainee) {
			int id=csset.getId();
			String name=csset.getName();
			int languages=csset.getLanguages();
			System.out.println("Id="+id+"name is "+name+" languages known "+languages);
		}
		System.out.println("*******diplay ecetrainees******");
		for(EceTrainee eceset:ecetrainee) {
			int id=eceset.getId();
			String name=eceset.getName();
			String devicesused=eceset.getDevicesused();
			System.out.println("Id="+id+"name is "+name+" devices used "+devicesused);
		}

	}
}
