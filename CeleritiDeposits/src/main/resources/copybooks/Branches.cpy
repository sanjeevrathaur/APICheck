02  BRANCH-RQRS.                
	03  BRANCHRQ.                         
		 05  RQ-POSTALCODE                PIC X(09). 
		 05  RQ-DISTANCE                  PIC X(03). 
		 05  RQ-DISTANCEUNIT              PIC X(05). 
		 05  RQ-LATITUDE                  PIC X(10). 
		 05  RQ-LONGITUDEPE               PIC X(11). 
		 05  RQ-TYPE                      PIC X(05). 
	03  BRANCHRS.                                         
		05  XSTATUS.                                      
			10 STATUSMESSAGE             PIC X(40).       
			10 SEVERITY                  PIC X(1).        
			10 DETAILMESSAGES.                            
			   15 PROPERTYNAME           PIC X(40).       
			   15 MESSAGEDESCRIPTION     PIC X(40).       
		05  BRANCH OCCURS 433 TIMES.                      
			10 RS-BR-NAME                PIC X(40).       
			10 RS-BR-ADDR-1              PIC X(40).       
			10 RS-BR-ADDR-2              PIC X(40).       
			10 RS-BR-ADDR-3              PIC X(40).       
			10 RS-BR-GEO-LATT            PIC S9(02)V9(6) COMP-3. 
			10 RS-BR-GEO-LONG            PIC S9(03)V9(6) COMP-3. 
			10 RS-WORKING-HRS OCCURS 7 TIMES.             
			   15  RS-BR-WORK-DAY        PIC X(9).        
			   15  RS-BR-OPEN-HRS        PIC 9(04).       
			   15  RS-BR-CLOSE-HRS       PIC 9(04).