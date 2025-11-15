holdData = 0;
result = 0;
gOperator = 0;
function operation(operator)
{
	var num1 = Number(document.getElementById("display").value);	
	switch (operator)
	{
		case 1:
			gOperator = operator;
			document.getElementById("display").value = "";
			break;
		case 2:		
			gOperator = operator;
			document.getElementById("display").value = "";			
			break;
		case 3:
			gOperator = operator;
			document.getElementById("display").value = "";
			break;
		case 4:
			gOperator = operator;
			document.getElementById("display").value = "";			
			break;		
		case 5:			
			document.getElementById("display").value = performArithematic();
			break;
	}
	holdData = num1;
}

function performArithematic()
{
	var num2 = Number(document.getElementById("display").value);	
	var MyResult;
	switch (gOperator)
	{
		case 1:
			MyResult = holdData + num2;
			break;
		case 2:
			MyResult = holdData - num2;	
			break;
		case 3:
			MyResult = holdData * num2;
			break;
		case 4:
			MyResult = holdData / num2;
			break;		
	}
	return MyResult;
}



function click0()
{
		var hold = document.getElementById("display").value;
		if(hold.length > 0)
		{
			document.getElementById("display").value=hold+"0";
		}
}
function setDigit(x)
{
	var hold = document.getElementById("display").value;
	if(x != 88)
	{
		document.getElementById("display").value=hold+""+x;	
	}
	else
	{
		document.getElementById("display").value=hold+".";
	}
}



function clearMe()
{	
	holdData = 0;
	result = 0;
	gOperator = 0; 
	document.getElementById("display").value="";
}
