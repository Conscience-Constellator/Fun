package CC.Util.Fun;

import CC.COd.Finishd;

import java.util.concurrent.Callable;

@Finishd(Is_Finishd=true)
public class Util
{
	@Finishd(Is_Finishd=true)
	public static <Rsult>Rsult Run_thN_Rtrn_Nul(Runnable Run)
	{
		Run.run();

		return null;
	}
	@Finishd(Is_Finishd=true)
	public static Runnable Nuly_Runbl=()->{};
	@Finishd(Is_Finishd=true)
	public static <Rsult>Rsult Try_Cal(Callable<Rsult> Calbl)
	{
		try
		{return Calbl.call();}
		catch(Exception X)
		{return (Rsult)X;}
	}
	@Finishd(Is_Finishd=true)
	public static Callable Nuly_Calbl=()->{return null;};
}