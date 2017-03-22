package Estimate.CalculateEstimate2;

public class CalcEstimate {
	private static final double FLAT_MARKUP = 0.05;	
	private static final double PERSON_MARKUP=0.012;
	private static final double PHARM_MARKUP=0.075;
	private static final double FOOD_MARKUP=0.13;
	private static final double ELECTRONICS_MARKUP=0.02;

		
		public static double calFlatMarkup(double base_price)
		{
			return (base_price+(base_price*FLAT_MARKUP));
		}
		
		public static double calculatePersonMarkup(double rate, int people)
		{
			return people*PERSON_MARKUP*rate;
		}
		
		public static double calculateMarkups(double rate, String category)
		{
			
			switch (category.toLowerCase())
			{
				case ("pharmaceuticals"):
					 rate=rate*PHARM_MARKUP;
					 break;
				case "food":
					 rate=rate*FOOD_MARKUP;
					 break;	
				case "electronics":
					 rate=rate*ELECTRONICS_MARKUP;
					 break;
				default:
					 return rate;
			}
				return rate;
		}
}
