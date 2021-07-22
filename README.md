# Me_Code
#This program is to implement a system for the transactional records
I have created the csv file using excel with the given transactional records  and loaded the csv file using java 
I have used two methonds to copy the records of csv into array one is using the Buffered Reader and the scanner class.
I was able to read the csv file records with the transactionID and retrive theie respective values using Java. However, I wasn't able to implement the logic as per the requirement as I was stuck on the functionalities.But I did know the logic using C  language.

**************** Here's my implementation logic***********

for (i=0; i<num_of_records; i++)
{
	if(records[i][1] == acc_num && simpleDateFormat(records[i][3]) >= start_date && simpleDateFormat(records[i][4]) <= end_date)
	{
		if (records[i][6] == "Payment")
		{
			amount -= records[i][5]
			transactions += 1
		}
		else if (records[i][6] == "reversal")
		{
			for(j=0; j<i; j++)
			{
				if (records[j][0] == records [i][7]
				{
					amount += records[i][5]
					transactions -=1
				}
			}
		}
	}
}
