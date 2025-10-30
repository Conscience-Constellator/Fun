package CC.Util.Fun;

import CC.COd.Finishd;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import java.util.concurrent.Callable;

@Finishd(Is_Finishd=true)
public class Runbl_Rapd_Calbl implements Runnable
{
	@Finishd(Is_Finishd=true)
	public Callable Rapd_Calbl;
		@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		public void run()
		{
			try
			{Rapd_Calbl.call();}
			catch(Exception X)
			{throw new RuntimeException(X);}
		}

	@Finishd(Is_Finishd=true)
	public Runbl_Rapd_Calbl(Callable Rapd)
	{Rapd_Calbl=Rapd;}
}