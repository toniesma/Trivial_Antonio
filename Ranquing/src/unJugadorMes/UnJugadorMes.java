package unJugadorMes;


public class UnJugadorMes{
public static void main(String[] args){
}

public static void UnJugadorMes(String [][]nomPuntsGeneral,int filasMax,int columnasMax) {
	
	String [][] arrayAux= new String[filasMax+1][columnasMax];
	for(int i=0; i<nomPuntsGeneral.length;i++)
	{
		for (int j=0;j<arrayAux[i].length;j++)
		{
			
			arrayAux[i][j]=nomPuntsGeneral[i][j];
		}
	}
	nomPuntsGeneral=arrayAux;

}
}

