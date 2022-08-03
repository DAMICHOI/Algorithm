package dami.algorithm;

/**
 * <h1>Linked List (연결 리스트)</h1>
 * 원소들을 저장할 때 그 다음 우너소가 있는 위치를 포함시키는 방식으로 저장하는 자료 구조
 *
 * <ol><b>연결 리스트의 성질</b>
 * <li>k번째 원소를 확인/변경하기 위해 O(k)가 필요함</li>
 * <li>임의의 위치에 원소를 추가/임의 위치의 원소 제거는 O(1)</li>
 * <li>원소들이 메모리 상에 연속해있지 않아 Cache hit rate가 낮지만 할당이 다소 쉬움</li>
 * </ol>
 *
 * <ol><b>연결 리스트의 종류</b>
 * <li>단일 연결 리스트(Singly Linked List)</li>
 * <li>이중 연결 리스트(Doubly Linked List)</li>
 * <li>원형 연결 리스트(Circular Linked List)</li>
 * </ol>
 *
 * <b>배열 vs 연결 리스트</b>
 * <table border="1" width="300px">
 *     <col width="40%" />
 *     <col width="30%" />
 *     <col width="30%" />
 *     <thead>
 *         <tr>
 *             <th></th>
 *             <th>배열</th>
 *             <th>연결 리스트</th>
 *         </tr>
 *     </thead>
 *     <tbody>
 *         <tr>
 *             <td>k번째 원소의 접근</td>
 *             <td>O(1)</td>
 *             <td>O(k)</td>
 *         </tr>
 *         <tr>
 *             <td>임의 위치에 원소 추가/제거</td>
 *             <td>O(N)</td>
 *             <td>O(1)</td>
 *         </tr>
 *         <tr>
 *             <td>메모리 상의 배치</td>
 *             <td>연속</td>
 *             <td>불연속</td>
 *         </tr>
 *         <tr>
 *             <td>추가적으로 필요한 공간<br/>(Overhead)</td>
 *             <td>-</td>
 *             <td>O(N)</td>
 *         </tr>
 *     </tbody>
 * </table>
 *
 * <ul>기능
 * 	   <li>임의의 위치에 있는 원소를 확인/변경 = O(N)</li>
 * 	   <li>임의의 위치에 원소를 추가/임의 위치의 원소 제거 = O(1)</li>
 * </ul>
 */
public class LinkedList {
	Node head;

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();

		System.out.println("*** 연결 리스트 요소 추가 ***");
		// 1 -> 12 -> 1 -> 4 -> 1
		linkedList.push(1);
		linkedList.push(4);
		linkedList.push(1);
		linkedList.push(12);
		linkedList.push(1);
		System.out.println(linkedList);
		System.out.println();

		System.out.println("*** 연결 리스트 검색 ***");
		if (linkedList.search(linkedList.head, 12)) {
			System.out.println("연결 리스트에 12가 존재함");
		} else {
			System.out.println("연결 리스트에 12가 존재하지 않음");
		}

		if (linkedList.recursiveSearch(linkedList.head, 0)) {
			System.out.println("연결 리스트에 0이 존재함");
		} else {
			System.out.println("연결 리스트에 0이 존재하지 않음");
		}
		System.out.println();

		System.out.println("*** 연결 리스트 초기화 ***");
		linkedList.deleteList();
		System.out.println(linkedList);
		System.out.println("연결 리스트 삭제됨");
	}

	/**
	 * 재귀를 이용한 검색
	 * @param head 검색 시작 지점
	 * @param x 검색할 숫자
	 * @return 검색 결과
	 */
	private boolean recursiveSearch(Node head, int x) {
		if (head == null) {
			return false;
		}

		if (head.data == x) {
			return true;
		}

		return recursiveSearch(head.next, x);
	}

	/**
	 * loop 를 이용한 검색
	 * @param head 검색 시작 지점
	 * @param x 검색할 숫자
	 * @return 검색 결과
	 */
	private boolean search(Node head, int x) {
		Node current = head;
		while (current != null) {
			if (current.data == x) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	/**
	 * Linked List 초기화
	 * (전체 데이터 제거)
	 */
	private void deleteList() {
		head = null;
	}

	/**
	 * Linked List 요소 추가
	 * @param newData 추가할 숫자
	 */
	void push(int newData) {
		Node newNode = new Node(newData);
		newNode.next = head;
		head = newNode;
	}

	/**
	 * 지정된 {@code prevNode} 뒤에 새 노드를 삽입한다.
	 * @param prevNode 이전 노드
	 * @param newData 새로 추가할 노드
	 */
	void insertAfter(Node prevNode, int newData) {
		if (prevNode == null) {
			System.out.println("지정된 이전 노드는 null 일 수 없습니다.");
			return;
		}

		Node newNode = new Node(newData);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
	}

	/**
	 * 끝에 새 노드를 추가한다.
	 * @param newData 새로 추가할 노
	 */
	void append(int newData) {
		Node newNode = new Node(newData);

		// Linked List 가 비어있으면 새 노드를 head 로 만들기
		if (head == null) {
			head = new Node(newData);
			return;
		}

		// 이 새 노드가 마지막 노드가 되므로, 다음 노드를 null 로 만들기
		newNode.next = null;

		// 그렇지 않으면 마지막 노드까지 이동한다.
		Node last = head;
		while (last.next != null) {
			last = last.next;
		}

		// 마지막 노드의 다음 노드 변경
		last.next = newNode;
		return;
	}

	@Override
	public String toString() {
		return String.format("{%s}", head);
	}

	static class Node {
		int data;
		Node next;

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

		@Override
		public String toString() {
			return data + "-> " + next;
		}
	}
}
