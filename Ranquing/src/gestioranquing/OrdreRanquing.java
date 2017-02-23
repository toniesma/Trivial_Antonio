package gestioranquing;



public class OrdreRanquing {
	
	
	
	public static void main(String[] args){
		String[][] nomPuntsGeneral = {{"pepe","10"},{"pepex","5"},{"pep","110"},{"pp","3000"},{"rdn","300"},{"pepe","1"}};
		ordreRanquing(nomPuntsGeneral);
		mostrarRanquing(nomPuntsGeneral);		
	}
	
	public static void comparacioRanquing(String [][] nomPuntsJugador, String [][]nomPuntsGeneral, int filasMax, int columnasMax)
	{
		nomPuntsGeneral[filasMax][columnasMax]=nomPuntsJugador[0][0];
	}
	
	public static void ordreRanquing(String[][]nomPuntsGeneral)
	{
		
	         int i, j;
	         int contador=0;
	         do{
	        	 contador=0;
	         for(i=0;i<nomPuntsGeneral.length-1;i++){
	             
	        	 	
	                   if(Integer.parseInt(nomPuntsGeneral[i+1][1])>Integer.parseInt(nomPuntsGeneral[i][1]))
	                   {
	                	  contador=1;
	                      String[][] aux= new String [1][1];
	                      aux[0][0]=nomPuntsGeneral[i+1][1];
	                      nomPuntsGeneral[i+1][1]=nomPuntsGeneral[i][1];
	                      nomPuntsGeneral[i][1]=aux[0][0];
	                   }
	              }
	        	}while (contador!=0);
	
	        
	}
	
	
	public static void mostrarRanquing(String[][]nomPuntsGeneral)
	{
		for(int i=0;i<nomPuntsGeneral.length;i++)
		{
			
				System.out.println(nomPuntsGeneral[i][0]+"--------------"+nomPuntsGeneral[i][1]);
			
		}
		
	}
}
