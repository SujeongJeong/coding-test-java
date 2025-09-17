import java.util.*;

class Solution {    
    public int[] solution(String[] genres, int[] plays) {
                
        // 장르별 총 재생수, 노래 목록 구하기
        Map<String, Integer> genreCnt = new HashMap<>();
        Map<String, List<int[]>> genreSongs = new HashMap<>();
        
        for(int i = 0; i < genres.length; i++){
            String key = genres[i];
            genreCnt.put(key, genreCnt.getOrDefault(key, 0) + plays[i]);
            genreSongs.computeIfAbsent(genres[i], k -> new ArrayList<>())
                .add(new int[]{i, plays[i]});
        }
        
        // 재생수 내림차순 정렬
        List<String> sortedGenre = new ArrayList<>(genreCnt.keySet());
        sortedGenre.sort((a,b) -> genreCnt.get(b).compareTo(genreCnt.get(a)));
        
        // 각 장르 노래리스트 정렬
        for (List<int[]> list : genreSongs.values()){
            list.sort((x,y) ->{
                // 재생수 비교
                if(y[1] != x[1]) return Integer.compare(y[1], x[1]);
                return Integer.compare(x[0], y[0]); // index 오름차순
            });
        }
        
        // 장르 순서대로 각 상위 2곡 수집
        List<Integer> picks = new ArrayList<>();
        for(String g : sortedGenre){
            List<int[]> list = genreSongs.get(g);
            for(int i=0; i < Math.min(2, list.size()); i++){
                picks.add(list.get(i)[0]);
            }
        }
        
        
        return picks.stream().mapToInt(i -> i).toArray();
    }
}