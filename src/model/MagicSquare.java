package model;

public class MagicSquare
{
	private int order;
	private int sense;
	private int centralBox;
	private int[][] square;
	public final static int NO = 1;
	public final static int NE = 2;
	public final static int SO = 3;
	public final static int SE = 4;
	public final static int RIGHT = 1;
	public final static int LEFT = 2;
	public final static int ABOVE = 3;
	public final static int DOWN = 4;

	public MagicSquare(int order, int sense, int centralBox)
	{
		this.order = order;
		this.sense = sense;
		this.centralBox = centralBox;
		square = new int[order][order];
		for(int i = 0; i< square.length; i++)
		{
			for(int j = 0; j< square[i].length; j++)
			{
				square[i][j] = 0;
			}
		}
	}

	public void setOrder(int order)
	{
		this.order = order;
	}

	public void setSense(int sense)
	{
		this.sense = sense;
	}

	public void setCentralBox(int centralBox)
	{
		this.centralBox = centralBox;
	}

	public int getOrder()
	{
		return order;
	}

	public int getSense()
	{
		return sense;
	}

	public int getCentralBox()
	{
		return centralBox;
	}

	public int getValue(int i, int j)
	{
		return square[i][j];
	}
	public int[][] getSquare()
	{
		return square;
	}

	public int calculateMagicConstant()
	{
		int constant = 0;
		constant = ((order*((order*order)+1))/2);
		return constant;
	}
	
	public int full(){
		int counter = 0;
		for(int i = 0; i< square.length; i++){
			for(int j = 0; j< square[i].length; j++){
				if (square[i][j] == 0 )
					counter++;
			}
		}return counter;
	}
	
	public void fillBox(int order, int sense, int centralBox)
	{
		if ((order%2) != 0) {
			int a = 1;
			int i = ((order-1)/2);
			int j = (square.length-1);
			if (centralBox == RIGHT) {
				square[i][j] = a;
				if(sense == NE) {
					while(full() !=0 ){
						a++;
						i--;
						j++;
						if(i == -1 && j>=order) {
						i++;
						j-=2;
						square[i][j] = a;	
						}else if(j >= order) {
							j = 0;
							square[i][j]=a;
						}else if(i == -1) {
							i = (order-1);
							square[i][j]=a;
						}else if(square[i][j] != 0) {
							i++;
							j-=2;
							square[i][j] = a;
						}else {
							square[i][j]=a;
						}
					}
				}else if(sense == SE) {
					while(full() !=0 ){
						a++;
						i++;
						j++;
						if(i >=order && j>=order) {
						i--;
						j-=2;
						square[i][j] = a;	
						}else if(j >= order) {
							j = 0;
							square[i][j]=a;
						}else if(i >= order) {
							i = 0;
							square[i][j]=a;
						}else if(square[i][j] != 0) {
							i--;
							j-=2;
							square[i][j] = a;
						}else {
							square[i][j]=a;
						}
					}
				}
			}else if(centralBox == LEFT) {
				j = 0;
				square[i][j] = a;
				if(sense == NO) {
					while(full() !=0 ){
						a++;
						i--;
						j--;
						if(i == -1 && j == -1) {
						i++;
						j+=2;
						square[i][j] = a;	
						}else if(j == -1) {
							j = (order-1);
							square[i][j]=a;
						}else if(i == -1) {
							i = (order-1);
							square[i][j]=a;
						}else if(square[i][j] != 0) {
							i++;
							j+=2;
							square[i][j] = a;
						}else {
							square[i][j]=a;
						}
					}
				}else if(sense == SO) {
					while(full() !=0 ){
						a++;
						i++;
						j--;
						if(i >=order && j==-1) {
						i--;
						j+=2;
						square[i][j] = a;	
						}else if(j == -1) {
							j = (order-1);
							square[i][j]=a;
						}else if(i >= order) {
							i = 0;
							square[i][j]=a;
						}else if(square[i][j] != 0) {
							i--;
							j+=2;
							square[i][j] = a;
						}else {
							square[i][j]=a;
						}
					}
				}
			}else if(centralBox == ABOVE) {
				j = 0;
				square[j][i] = a;
				if(sense == NE) {
					while(full() !=0 ){
						a++;
						i++;
						j--;
						if(j == -1 && i>=order) {
						i--;
						j+=2;
						square[j][i] = a;	
						}else if(i >= order) {
							i = 0;
							square[j][i]=a;
						}else if(j == -1) {
							j = (order-1);
							square[j][i]=a;
						}else if(square[j][i] != 0) {
							i--;
							j+=2;
							square[j][i] = a;
						}else {
							square[j][i]=a;
						}
					}
				}else if(sense == NO) {
					while(full() !=0 ){
						a++;
						i--;
						j--;
						if(i == -1 && j == -1) {
						i++;
						j+=2;
						square[j][i] = a;	
						}else if(j == -1) {
							j = (order-1);
							square[j][i]=a;
						}else if(i == -1) {
							i = (order-1);
							square[j][i]=a;
						}else if(square[j][i] != 0) {
							i++;
							j+=2;
							square[j][i] = a;
						}else {
							square[j][i]=a;
						}
					}
				}
			}else if(centralBox == DOWN) {
				square[j][i] = a;
				if(sense == SO) {
					while(full() !=0 ){
						a++;
						i--;
						j++;
						if(i == -1 && j>=order) {
							i++;
							j-=2;
							System.out.println("i"+i+"j"+j+"a:"+a);
							square[j][i] = a;	
						}else if(j >= order) {
							j = 0;
							square[j][i]=a;
						}else if(i == -1) {
							i = (order-1);
							square[j][i]=a;
						}else if(square[j][i] != 0) {
							j-=2;
							i++;
							square[j][i] = a;
						}else {
							square[j][i]=a;
						}
					}
				}else if(sense == SE) {
					while(full() !=0 ){
						a++;
						i++;
						j++;
						if(i >=order && j >=order) {
						i--;
						j-=2;
						square[j][i] = a;	
						}else if(j >= order) {
							j = 0;
							square[j][i]=a;
						}else if(i >= order) {
							i = 0;
							square[j][i]=a;
						}else if(square[j][i] != 0) {
							i--;
							j-=2;
							square[j][i] = a;
						}else {
							square[j][i]=a;
						}
					}
				}
			}
		}else 
			System.out.print("The magic square can not be made");
	}
	
	public String magicSquare(){
		String magicSquare = "";
		for(int i = 0; i < square.length;i++) {
			for(int j = 0; j<square[i].length;j++) {
				magicSquare += square[i][j] + "\t";
			}
			magicSquare += "\n";
		}
		return magicSquare;
	}
}


