package Test;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_17142 {
    public static int N, M, INF = 987654321, min = INF;
    public static boolean flag;
    public static int[][] maps, visit;
    public static boolean[] v;
    public static Point[] w; //Point : 좌표 상에 어떤 위치를 나타내는 데 사용, x와 y값을 저장하기 위한 멤버변수를 가지고 있음.
    public static ArrayList<Point> vir;
    public static int[] dr = {-1,1,0,0}, dc = {0,0,-1,1}; //상하좌우
    public static void main(String[] args) throws Exception {

        INIT();
        comb(0,0);
        if(min == INF)
            System.out.println(-1);
        else
            System.out.println(min);
        
        
    }
    public static void INIT() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());    //연구소 크기
        M = Integer.parseInt(st.nextToken());    //활성화 시킬 바이러스 갯수
        maps = new int[N][N];
        vir = new ArrayList<>();
        for(int i = 0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<N; j++) {
                maps[i][j] = Integer.parseInt(st.nextToken());
                if(maps[i][j] == 2)    //비활성 바이러스라면
                    vir.add(new Point(i, j));
            }
        }//INIT END
        w = new Point[vir.size()];
        v = new boolean[vir.size()];
    }

    public static void comb(int start, int cnt) {
        if(M == cnt) {
            int sol = BFS();
            min = min<sol?min:sol;
            return;
        }
        for(int i = start; i<vir.size(); i++) {
            if(!v[i]) {
                v[i] = true;
                w[cnt] = vir.get(i);    //바이러스 위치 저장
                comb(i, cnt+1);
                v[i] = false;
            }
        }
    }
    
    public static int BFS() {
        int times = 1;
        flag = false;
        visit = new int[N][N];    //돌 때마다 새로 만들어줘야함
        int[][] copys = new int[N][N];
        for(int i = 0; i<N; i++) {
            copys[i] = maps[i].clone();
        }
        
        Queue <Point> q = new LinkedList<Point>();
        for(int i = 0; i<M; i++) {
        	/*
        	 * offer와 add는 명백히 차이가 있다.
        	 * offer 메소드는 큐가 가득차서 더이상 추가할 수 없는 경우 false를 반환하고 요소가 추가되면 true를 반환하며 특정 예외를 throw하지 않는다.
        	 * add 메소드는 IllegalStateException를 발생시킨다. 
        	 * Collection 인터페이스에서 설명되어 있기를, throw를 하는 것은 호출이 반환 후에 콜렉션이 항상 지정된 요소를 포함한다는 불변 조건이 유지된다고 한다. 
        	 * Queue 인터페이스에서는 삽입 제한을 부과할 수 있는 대기열을 사용할 경우 일반적인 메소드 offer은 Collection.add(E) 메소드보다 바람직하다고 한다.
        	 * [출처] [Java] Queue의 offer과 add의 차이|작성자 애기지원
        	 */
            q.offer(w[i]); //
            visit[w[i].x][w[i].y] = 1;
        }//활성 바이러스 위치 저장
        
        while(!q.isEmpty()) {
            int r = q.peek().x;
            int c = q.poll().y;
            if(copys[r][c] == 3)
                times = times>visit[r][c]?times:visit[r][c];
            
            loop:for(int i = 0; i<N; i++) {
                for(int j = 0; j<N; j++) {
                    if(flag)
                        break loop;
                    if(!flag && maps[i][j] == 0) {
                        flag = true;
                    }
                }
            }
            
            if(!flag)
                return times-1;
            
            
            for(int d = 0; d<dr.length; d++) {
                int nr = r + dr[d];
                int nc = c + dc[d];
                
                if(isIn(nr, nc) && visit[nr][nc] == 0 && copys[nr][nc] == 0) {
                    visit[nr][nc] = visit[r][c] + 1;
                    copys[nr][nc] = 3;
                    q.offer(new Point(nr, nc));
                } else if(isIn(nr, nc) && visit[nr][nc] == 0 && copys[nr][nc] == 2) {
                    visit[nr][nc] = visit[r][c]+ 1;
                    q.offer(new Point(nr, nc));
                }
                
            }
        }
        
        for(int i = 0; i<N; i++) {
            for(int j = 0; j<N; j++) {
                if(copys[i][j] == 0) {
                    return INF;
                }
            }
        }
        
        return times-1;
    }
    public static boolean isIn(int r, int c) {
        return (0<= r && r<N && 0<=c && c<N);
    }
}