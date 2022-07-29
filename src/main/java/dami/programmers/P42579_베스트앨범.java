package dami.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P42579_베스트앨범 {
	public static void main(String[] args) {
		P42579_베스트앨범 solution = new P42579_베스트앨범();
		for (int n : solution.solution(new String[] {"classic", "pop", "classic", "classic", "pop"},
			new int[] {500, 600, 150, 800, 2500})) {
			System.out.print(n + " ");
		}
	}

	private int[] solution(String[] genres, int[] plays) {
		int[] answer = {};

		MusicInfo[] musicInfos = new MusicInfo[genres.length];
		Map<String, GenreInfo> genresMap = new HashMap<>();
		GenreInfo[] genreInfos;

		// 1. setting
		for (int i = 0; i < genres.length; i++) {
			// musicInfo Setting
			musicInfos[i] = new MusicInfo();
			musicInfos[i].id = i;
			musicInfos[i].genre = genres[i];
			musicInfos[i].playCount = plays[i];

			// genresMap Setting
			genresMap.put(genres[i], genresMap.getOrDefault(genres[i], new GenreInfo(genres[i])));
		}

		// 2. sort MusicInfo
		Arrays.sort(musicInfos);

		// 3. put genresMap
		for (MusicInfo music : musicInfos) {
			GenreInfo genre = genresMap.get(music.genre);
			genre.sum += music.playCount;

			if (genre.count < 2) {
				genre.topMusic[genre.count] = music.id;
			}

			genre.count++;
		}

		// 4. copy genreMap to array
		genreInfos = new GenreInfo[genresMap.size()];
		int idx = 0;
		int musicCount = 0;

		for (String key : genresMap.keySet()) {
			genreInfos[idx] = genresMap.get(key);
			musicCount += Math.min(genreInfos[idx].count, 2);
			idx++;
		}

		Arrays.sort(genreInfos);

		// 5. add answers
		answer = new int[musicCount];
		idx = 0;
		for (GenreInfo genre : genreInfos) {
			int limit = Math.min(genre.count, 2);
			for (int i = 0; i < limit; i++) {
				answer[idx++] = genre.topMusic[i];
			}
		}

		return answer;
	}
}

class GenreInfo implements Comparable<GenreInfo> {

	String genre;    // 장르
	int sum;        // 재생 횟수 합계
	int count;        // 재생 횟수
	int[] topMusic = new int[2];    // top2 인기곡 고유번호

	public GenreInfo(String genre) {
		this.genre = genre;
		sum = 0;
		count = 0;
		topMusic[0] = -1;
		topMusic[1] = -1;
	}

	public int getSum() {
		return sum;
	}

	@Override
	public int compareTo(GenreInfo o) {
		return o.getSum() - this.sum;
	}
}

class MusicInfo implements Comparable<MusicInfo> {
	int id;            // 노래 고유 번호
	String genre;    // 장르
	int playCount;    // 재생 횟수

	int getPlayCount() {
		return playCount;
	}

	@Override
	public int compareTo(MusicInfo o) {
		return o.getPlayCount() - this.playCount;
	}
}