//package item;
//
//import static org.junit.Assert.*;
//
//import org.junit.Test;
//
//public class TestItemFactory
//{
//	ItemFactory factory = new ItemFactory();
//	
//	@Test
//	public void testArmCreation()
//	{
//		BodyPart brassArms = factory.makePart("Goblin", "Brass", "Arms");
//		assertEquals("Goblin Brass Arms", brassArms.getPartName());
//	}
//	
//	@Test
//	public void testTorsoCreation()
//	{
//		BodyPart brassChasis = factory.makePart("Goblin", "Brass", "Torso");
//		assertEquals("Goblin Brass Torso", brassChasis.getPartName());
//	}
//	
//	@Test
//	public void testLegsCreation()
//	{
//		BodyPart brassLegs = factory.makePart("Goblin", "Brass", "Legs");
//		assertEquals("Goblin Brass Legs", brassLegs.getPartName());
//	}
//	
//	@Test
//	public void testHeadCreation()
//	{
//		BodyPart brassHead = factory.makePart("Goblin", "Brass", "Head");
//		assertEquals("Goblin Brass Head", brassHead.getPartName());
//	}
//}
