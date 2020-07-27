package Go;

import Attracties.GokAttracties;

public class BelastingInspecteur extends Kassa{ 

	void belastingInnen(GokAttracties g) { 
		g.kansSpelBelastingBetalen();
	
		TotaleBelastingBerekenaar();
	}
	
}
