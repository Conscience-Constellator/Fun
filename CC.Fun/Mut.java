package CC.Util.Fun;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

public class Mut<Inst,Rsult> extends Rapr<Inst,Rsult>
{
//	public static final Clas_Rap Class=Init_StRt(Mut.class
//		,Class.class
//	);/*Dep ?done*/

	public int[] From,To;
		public final int Inst=-1;

	@Override
	public Rsult V_Rsult_Inst(Inst Inst,Object... PRg)
	{
		Object Tran;
		int COd;
		for(int IndX=0;
			IndX<From.length;
			IndX+=1)
		{
			COd=From[IndX];
			if(COd==-1)
			{
				COd=To[IndX];
				Tran=PRg[COd];
				PRg[COd]=Inst;
				Inst=(Inst)Tran;
			}
			else
			{
				Tran=PRg[COd];
				int COd_2=To[IndX];
				if(COd_2==-1)
				{
					PRg[COd]=Inst;
					Inst=(Inst)Tran;
				}
			}
		}

		return super.V_Rsult_Inst(Inst,PRg);
	}

	public Mut(V_Rsult_Inst<Inst,Rsult> Rapd,int[] From,int[] To)
	{
		super(Rapd);
	}
	public Mut(){}

//	static{Init_Nd(Mut.class);}
}