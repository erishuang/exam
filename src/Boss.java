

class Boss extends Monster{
	
	private int stage;
	private final int initialHealth;
	
	public Boss (int health, int power){
		super(health,power);
		initialHealth = health;
		stage = 1;
	}
	
	public void takeDamage (int damage){
		super.takeDamage(damage);
		int health = super.health - damage;
		double healthLeft= health / initialHealth;
		if((!(super.isDefeated()))&&(healthLeft<0.5)){
			stage++;
			power *= 2;
		}
		if((!(super.isDefeated()))&&(healthLeft<0.2)){
			stage++;
			power *= 2;
		}
		/*if (isDefeated()){
			 healthLeft = health / initialHealth;
		}
		if (stage == 1){
			if (healthLeft < 0.5 && healthLeft > 0.2){
				stage++;
				power *= 2;//power*2;
			}else if (health < 0.2){
				stage += 2;
				power *= 4;//power *= 2; power *= 2;
			}
		else if (stage == 2){
			stage++;
			power *=2;
		}
		}*/
	}
	
	
	public String toString(){
		String retn = super.toString();
		//return retn + "\n" + "Stage" + stage;
		return retn + "\nStage: " + stage;	
		//toString()
	}
	public static void main(String[] args){
		Boss boss = new Boss(600,20);
		boss.takeDamage(550);
		System.out.println(boss.toString());
	}
}
