package com.techymeet.leetCodeProgram;

public class TimeNeededtoBuyTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] tickets = {2,3,2};
        int k = 2;
        System.out.println(timeRequiredToBuy(tickets,k));
	}

	private static int timeRequiredToBuy(int[] tickets, int k) {
		// TODO Auto-generated method stub
		int ticketToBuy = tickets[k];
		int time = 0;
		for(int i=0;i<tickets.length;i++) {
			if(i<=k) {
				time += Math.min(ticketToBuy, tickets[i]);
			}else {
				time+= Math.min(ticketToBuy-1,tickets[i]);
			}
		}
		return time;
	}

}
