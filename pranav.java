Class usermaincode
{
Public String moverobot(int input1,int input2,String input3,String input4)
{
int x=input1;
        int y=input2;
        String temp="";
        String output[]=new String[2];
	//dividing input3 into 3 parts by skipping “-“ and store first value as x-coord, second value as y-coord then third value as dir.
        String initial[]=input3.split("-");
        int xc=Integer.parseInt(initial[0]); 
        int yc=Integer.parseInt(initial[1]);
        String dir=initial[2];
	//Reading the input4 as array values by skipping spaces
        String moves[]=input4.split(" ");
	//Based on each array values, the directions are set or xcoord and ycoord vales are set ( i.e if the array value is L/R/r/l then based on the current direction and L/R/l/r the current direction is set. If the the array value is m or M then new xc and yc value is formed).
        for(int i=0;i<moves.length;i++)
        {
            if (dir.equals("E")&&moves[i].equals("L"))
                dir="N";
            else if (dir.equals("E")&&moves[i].equals("l"))
                dir="NE";
            else if (dir.equals("E")&& moves[i].equals("R"))
                dir="S";
            else if (dir.equals("E")&& moves[i].equals("r"))
                dir="SE";
            else if (dir.equals("N")&&moves[i].equals("L"))
                dir="W";
            else if (dir.equals("N")&&moves[i].equals("l"))
                dir="NW";
            else if (dir.equals("N")&&moves[i].equals("R"))
                dir="E";
            else if (dir.equals("N")&&moves[i].equals("r"))
                dir="NE";
            else if (dir.equals("W")&&moves[i].equals("R"))
                dir="N";
            else if (dir.equals("W")&&moves[i].equals("r"))
                dir="NW";
            else if (dir.equals("W")&&moves[i].equals("L"))
                dir="S";
            else if (dir.equals("W")&&moves[i].equals("l"))
                dir="SW";
            else if (dir.equals("S")&&moves[i].equals("R"))
                dir="W";
            else if (dir.equals("S")&&moves[i].equals("r"))
                dir="SW";
            else if (dir.equals("S")&&moves[i].equals("L"))
                dir="E";
            else if (dir.equals("S")&&moves[i].equals("l"))
                dir="SE";
            else if (dir.equals("NE")&&moves[i].equals("R"))
                dir="SE";
            else if (dir.equals("NE")&&moves[i].equals("r"))
                dir="E";
            else if (dir.equals("NE")&&moves[i].equals("L"))
                dir="NW";
            else if (dir.equals("NE")&&moves[i].equals("l"))
                dir="N";
            else if (dir.equals("NW")&&moves[i].equals("R"))
                dir="NE";
            else if (dir.equals("NW")&&moves[i].equals("r"))
                dir="N";
            else if (dir.equals("NW")&&moves[i].equals("L"))
                dir="SW";
            else if (dir.equals("NW")&&moves[i].equals("l"))
                dir="W";
            else if (dir.equals("SW")&&moves[i].equals("R"))
                dir="NW";
            else if (dir.equals("SW")&&moves[i].equals("r"))
                dir="W";
            else if (dir.equals("SW")&&moves[i].equals("L"))
                dir="SE";
            else if (dir.equals("SW")&&moves[i].equals("l"))
                dir="S";
            else if (dir.equals("SE")&&moves[i].equals("R"))
                dir="SW";
            else if (dir.equals("SE")&&moves[i].equals("r"))
                dir="S";
            else if (dir.equals("SE")&&moves[i].equals("L"))
                dir="NE";
            else if (dir.equals("SE")&&moves[i].equals("l"))
                dir="E";
            int inc=0;
            if(moves[i].equals("M"))
                inc=1;
            else if(moves[i].equals("m"))
                inc=2;        
            if(dir.equals("E"))
                xc+=inc;
            else if(dir.equals("N"))
                yc+=inc;
            else if(dir.equals("W"))
                xc-=inc;
            else if(dir.equals("S"))
                yc-=inc;
            else if(dir.equals("NE"))
            {
                xc+=inc;
                yc+=inc;
            }else if(dir.equals("NW"))
            {
                xc-=inc;
                yc+=inc;
            }else if(dir.equals("SW"))
            {
                xc-=inc;
                yc-=inc;
            }
            else if(dir.equals("SE"))
            {
                xc+=inc;
                yc-=inc;
            }
            output[0]=output[1];   //store the last position of robot into output[0]
            output[1]=(xc+"-"+yc+"-"+dir); //store the current position and dir of robot
            if(xc<0||xc>x||yc<0||yc>y)  	
            {
                dir="ER";
                break;
            }
        }
        if(dir.equals("ER"))
            return (output[0]+"-ER");
        else
            return output[1];
    }
}

