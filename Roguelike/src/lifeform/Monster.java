package lifeform;

import item.BodyPart;

public class Monster extends LifeForm
{
	public void setArms(BodyPart arms){
		this.arms = arms;
	}
	
	public BodyPart getArms(){
		return arms;
	}
	
	public void setLegs(BodyPart legs){
		this.legs = legs;
	}
	
	public BodyPart getLegs(){
		return legs;
	}

	public void setTorso(BodyPart torso){
		this.torso = torso;
	}
	
	public BodyPart getTorso(){
		return torso;
	}
	
	public void setHead(BodyPart head){
		this.head = head;
	}
	
	public BodyPart getHead(){
		return head;
	}
}
