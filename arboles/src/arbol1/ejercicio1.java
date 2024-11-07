package arbol1;

class ejercicio1 {

    Node root;

    public ejercicio1() {
        this.root = null;
    }

    public Node addElem(int valor) {
        this.root = addElemRecu(this.root, valor);
        return this.root;
    }

    public Node addElemRecu(Node actual, int valor) {
        if (actual == null) {
            return new Node(valor);
        }
        if (valor > actual.value) {
            actual.right = addElemRecu(actual.right, valor);
        } else {
            actual.left = addElemRecu(actual.left, valor);
        }
        return actual;
    }

    public boolean shearchElem(int valor) {
        return shearchElemRecu(this.root, valor);
    }

    public boolean shearchElemRecu(Node actual, int valor) {
        if (actual == null) {
            return false;
        }
        if (valor == actual.value) {
            return true;
        }
        if (valor > actual.value) {
            return shearchElemRecu(actual.right, valor); 
        } else {
            return shearchElemRecu(actual.left, valor);
        }
    }

    //metodo para saber si un metodo es estricto o no
    public boolean estricto() {
    	return estrictoRecu(root);
    }
    
    public boolean estrictoRecu(Node current) {
        if (current == null) {
            return true;
        }
        
        if ((current.left == null && current.right != null) || (current.left != null && current.right == null)) {
            return false;
        }

        return estrictoRecu(current.left) && estrictoRecu(current.right);
    }
    
    //Metodo para saber la altura del arbol
    public int altura() {
        return alturaRec(root);
    }

   
    private int alturaRec(Node current) {
        if (current == null) {
            return 0; 
        }
        
        int alturaIzquierda = alturaRec(current.left);
        int alturaDerecha = alturaRec(current.right);

        return 1 + Math.max(alturaIzquierda, alturaDerecha);
    }
    
    
    //Metodo para saber el nodo mas alto
    public int maximo() {
    	return maximoRec(root);
    }
    
    public int maximoRec(Node current) {
    	if(current == null) {
    		return -1;
    	}
        
        return Math.max(current.value, Math.max(maximoRec(current.left), maximoRec(current.right)));
    }
    
    
    //Metodo para saber cuantos nodos tiene un arbol
    
    public int cuenta() {
    	return cuentaRec(root);
    }
    
    public int cuentaRec(Node current) {
    	if(current == null)
    		return 0;
    	
    	return 1 + cuentaRec(current.left) + cuentaRec(current.right);
    }
    
    
    //Metodo que cuenta hojas
    
    public int cuentaHojas() {
    	return cuentaHojasRec(root);
    }
    
    public int cuentaHojasRec(Node current) {
    	if(current == null) {
    		return 0;
    	}
    	
    	if (current.left == null && current.right == null) {
            return 1;
        }
    	
    	 return cuentaHojasRec(current.left) + cuentaHojasRec(current.right);
    	
    }
    
   //metodo para sumar los nodos
    
    public int suma() {
    	return sumaRec(root);
    }
    
    public int sumaRec(Node current) {
    	
       	if(current == null)
    		return 0;
       	
       	return current.value + sumaRec(current.left) + sumaRec(current.right);
    }
    
    
    //metodo para sumar pares
    
    public int sumaPar() {
    	return sumaParRec(root);
    }
    
    public int sumaParRec(Node current) {
    	
    	if(current == null)
    		return 0;
       	
    	if(current.value % 2 == 0) {
    		return current.value + sumaParRec(current.left) + sumaParRec(current.right);
    	}
    		
    	
       	return sumaParRec(current.left) + sumaParRec(current.right);
    }
    
    
    public boolean isIdentical ( ejercicio1 other ) {
    	 return isIdenticalRec ( this.root , other.root ) ;
    	 }
    
    private boolean isIdenticalRec(Node nodo,Node nodo2){
    	if(nodo == null && nodo2 == null) {
    		return true;
    	}
    	if(nodo == null || nodo2 == null) {
    		return false;
    	}
    	
    	return (nodo.value == nodo2.value)&& isIdenticalRec(nodo.left,nodo2.left) && isIdenticalRec(nodo.right,nodo2.right);
    	
    }
    
    
    
    
    
    
    
    
    // Métodos de eliminación de nodos
    public void delete(int value) {
        root = deleteRecursive(root, value);
    }

    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.value) {
            // Caso 1: Nodo hoja
            if (current.left == null && current.right == null) {
                return null;
            }

            // Caso 2: Un solo hijo
            if (current.right == null) {
                return current.left;
            }
            if (current.left == null) {
                return current.right;
            }

            // Caso 3: Dos hijos
            int smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
        }

        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }

        current.right = deleteRecursive(current.right, value);
        return current;
    }

    private int findSmallestValue(Node right) {
        return right.left == null ? right.value : findSmallestValue(right.left);
    }
}
