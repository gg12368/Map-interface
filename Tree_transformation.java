final void treeifyBin(Node<K,v>[] tab,int hash) {
	int n,index;Node<K,V> e;
	if(tab==null||(n=tab.length)<MIN_TREEIFY_CAPACITY)
		resize();
	else if((e=tab[index=(n-1)&hash])!=null) {
		//树化改造逻辑
	}
}
