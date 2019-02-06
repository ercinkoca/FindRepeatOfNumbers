public static void main(String args[]) {
		
		List<Integer> liste=new ArrayList<Integer>();
		Random rand = new Random();
		
		for(int i=0; i<100; i++) {
			int n = rand.nextInt(100) + 1;
			liste.add(i, n);
		}
		
		calculate(liste);
	}


	public static void calculate(List<Integer> list) {
		HashMap<Integer, Integer> hsh=new HashMap<Integer,Integer>();
		int sayi=0;
		for(int i=0; i<list.size();i++) {
			for(int j=0;j<list.size();j++) {
				if(list.get(i).equals(list.get(j))) {
					sayi++;
				}
				hsh.put(list.get(i),sayi);
			}
			sayi=0;
		}
		System.out.println(list);
		System.out.println(hsh);
	}