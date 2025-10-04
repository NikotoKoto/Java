package org.example.Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Array_List {

    public static List<Integer> convertArrayToList(int[] a){
 /*
1. Problème :
   Transformer un tablezau de int[] en list Integer

2. Input :
   int[]a = [2,3,4,6,7]

3. Output :
   List<Integer> = [2,3,4,6,7]

4. Cas limites :
   tableau null
   tableau vide

5. Structures utilisées :
   List pour stocker le resultat

6. Étapes :
   1. Verifier les cas limites
   2. Créer une liste vide
   3. Parcourir le tableau
   4. Ajouter chaque element dans la liste
   5. Retourner la liste

7. Complexité :
   Temps : O(n)
   Mémoire : O(n)


8. Jeux de tests :
   - Input: ... → Output: ...
   - Input: ... → Output: ...
   - Input: ... → Output: ...
*/
        List<Integer> result = new ArrayList<>();
        if(a == null || a.length == 0) return List.of();

        for(int n : a){
            result.add(n);
        }
        return result;
    }


    public static int[] returnPair (int[] a){
       /*
1. Problème :
   Retourner dans un tableau les valeurs pair d'un tableau de int en entrée

2. Input :
   tableau de int[] a

3. Output :
   tableau de int[] result

4. Cas limites :
   tableau vide ou null

5. Structures utilisées :
   un nouveau tableau de int[] pour retourner le resultat

6. Étapes :
   1. gerer les cas limites
   2. initialiser notre tableau de retour
   3. parcourir le tableau en entrée
   4. Vérifier que la valeur soit paire ou non
   5. Si oui ajouté dans le tableau de retour
   6. Sinon rien faire
   7. retourner le tableau

7. Complexité :
   Temps : O(n)
   Mémoire : O(n)
   on parcours une seule fois le tableau

8. Jeux de tests :
   - Input: ... → Output: ...
   - Input: ... → Output: ...
   - Input: ... → Output: ...
*/

        if(a == null || a.length == 0) return new int[]{};
        int count =0;
        int[] result = new int[]{count} ;

        for(int i : a){
            if(i % 2 == 0) count++;
        }
        int j = 0;
        for (int n : a){
            if(j%2 == 0) result[j++] = n;
        }
        return result;
    }


    public static int[] convertListToIntArray(List<Integer> a){
        /*
1. Problème :
  Convertir une list de integer en tableau de int

2. Input :
   list integer

3. Output :
   tableau de int

4. Cas limites :
   list est vide ou null

5. Structures utilisées :
    si sortie = tableau fixe → il faut connaître la taille → donc compter avant.
    compteur et tableau de int en retour
     si sortie = List → taille dynamique → pas besoin de compter.)

6. Étapes :
   1. testé les cas limites
   2. initialisé le compte
   3. Créer et initialisé la taille du tableau de int
   4. bouclé pour chaque element de la list afin de definir la taille du tableau
   5. bouclé pour chaque element de la list ou on ajoute l'element dans le tableau de retour
   6. Retourné le tableau
7. Complexité :
   Temps : O(n)
   Mémoire : O(n)
   Car on parcours une seule fois le tableau

8. Jeux de tests :
   - Input: List.of(1,2,3) → Output: int[] {1,2,3}
   - Input: ... → Output: ...
   - Input: ... → Output: ...
*/
      if(a.isEmpty() || a == null) return new int[]{};
      int count = 0;
      int[] result = new int[]{a.size()};
      for(int n : a){
          result[count++] = n;
      }
      return result;
    }

    public static Map<String, Integer> countWordFrequency(String input){
        /*
1. Problème :
  Compter la frequence d'un meme mot dans une phrase

2. Input :
   String

3. Output :
   Map<String,Integer>

4. Cas limites :
   input null ou taille <1

5. Structures utilisées :
    si sortie = tableau fixe → il faut connaître la taille → donc compter avant.
     si sortie = List → taille dynamique → pas besoin de compter.)
    une nouvelle map pour retourner le resultat
6. Étapes :
   1. Testé les cas limites
   2. initialisé la map retour
   3. bouclé sur chaque element de string en splitant par espace pour retourner un tableau de string pour chaque mot
   4. puis ajouté chacun de ces mots dans la map en key la string et en valeur le nombre de fois qu'on le voit
   5. retourner la map

7. Complexité :
   Temps : O(n)
   Mémoire : O(n)
   On parocvurs une fois le tableau

8. Jeux de tests :
   - Input: "bonjour bonjour à tous bonjour" → Output: {
  "bonjour" = 3,
  "à" = 1,
  "tous" = 1
}
   - Input: ... → Output: ...
   - Input: ... → Output: ...
*/

        if(input.isEmpty()|| input.length() == 0) return new HashMap<>();

        Map<String,Integer> result = new HashMap<>();
        for(String s : input.split(" ")){
            result.put(s, result.getOrDefault(s,0)+1);
        }

        return result;
    }

    public static Map<String,Integer> FilterPrice(Map<String, Integer> input ){
        /*
1. Problème :
   filter une map et retourner une nouvelle map avec des datas differentes

2. Input :
   Map<String, Integer>

3. Output :
   Map<String,Integer>

4. Cas limites :
   si la map est vide ou null

5. Structures utilisées :
    si sortie = tableau fixe → il faut connaître la taille → donc compter avant.
     si sortie = List → taille dynamique → pas besoin de compter.)
     on reutilise la meme map mais avec une api stream

6. Étapes :
   1. parcourir la map
   2. filter la map
   3. retourner la map
   ...

7. Complexité :
   Temps : O(n)
   Mémoire : O(n)
    On retourne la meme map et on parcours qu'une seule fois.
8. Jeux de tests :
   - Input: ... → Output: ...
   - Input: ... → Output: ...
   - Input: ... → Output: ...
*/
        if(input.isEmpty() || input == null) return new HashMap<>();
        return input.entrySet().stream()
                .filter(m -> m.getValue() > 10)
                .collect(Collectors.toMap(Map.Entry:: getKey,Map.Entry:: getValue ));
    }
}
