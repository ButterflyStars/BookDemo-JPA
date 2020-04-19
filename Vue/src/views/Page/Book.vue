<template>
  <div class id>
    <el-table :data="tableData" border>
      <el-table-column fixed prop="id" label="编号" width="150"></el-table-column>
      <el-table-column prop="name" label="图书名" width="120"></el-table-column>
      <el-table-column prop="author" label="作者" width="120"></el-table-column>
      <el-table-column prop="publish" label="出版社" width="120"></el-table-column>
      <el-table-column prop="price" label="价格"></el-table-column>
      <el-table-column fixed="right" label="操作" width="100">
        <template slot-scope="scope">
          <el-button type="text" @click="handleClick(scope.row)">修改</el-button>
          <el-button type="text" @click="deleteBook(scope.row)">删除</el-button>
        </template>
      </el-table-column>
    </el-table>
    <!-- 分页 -->
    <!-- page-size 每页页数  total 总条数 @current-change 点击页数执行的方法-->
    <el-pagination
      background
      layout="prev, pager, next"
      :total="total"
      :page-size="pageSize"
      @current-change="page"
    ></el-pagination>

    <el-dialog title="书籍信息修改" :visible.sync="dialogFormVisible">
      <el-form :model="form">
        <el-form-item label="图书名" :label-width="formLabelWidth">
          <el-input v-model="form.name" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="作者" :label-width="formLabelWidth">
          <el-input v-model="form.author" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="出版社" :label-width="formLabelWidth">
          <el-input v-model="form.publish" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="价格" :label-width="formLabelWidth">
          <el-input v-model="form.price" autocomplete="off"></el-input>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false">取 消</el-button>
        <el-button type="primary" @click="update">确 定</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import axios from "axios";
export default {
  name: "",
  data() {
    return {
      total: 0,
      pageSize: 0,
      dialogFormVisible: false,
      tableData: [
        {
          id: "",
          name: "",
          author: "",
          publish: "",
          price: ""
        }
      ],
      form: {
        id: "",
        name: "",
        author: "",
        publish: "",
        price: ""
      },
      formLabelWidth: "120px"
    };
  },
  methods: {
    handleClick(row) {
      this.dialogFormVisible = true; //打开弹窗
      this.form = row; //将该行数据信息传入弹出弹窗的数据中
    },
    update() {
      axios.put(`http://127.0.0.1:8081/book/update`, this.form).then(res => {
        if (res.data == "success") {
          this.$message({
            message: "书籍修改成功",
            type: "success",
            center: true
          });
          this.dialogFormVisible = false;

          console.log(res);
        }
      });
    },
    deleteBook(row) {
      axios
        .delete(`http://127.0.0.1:8081/book/deleteById/${row.id}`)
        .then(res => {
          if (res.status == 200) {
            this.$message({
              message: "书籍删除成功",
              type: "success",
              center: true
            });
            window.location.reload();
          }
        });
    },
    page(currentPage) {
      axios
        .get(`http://127.0.0.1:8081/book/findAll/${currentPage - 1}/6`)
        .then(res => {
          this.tableData = res.data.content;
          // this.total = res.data.totalElements;
          // this.pageSize = res.data.size;
        });
    }
  },
  created() {
    axios.get(`http://127.0.0.1:8081/book/findAll/0/6`).then(res => {
      this.tableData = res.data.content;
      this.total = res.data.totalElements;
      this.pageSize = res.data.size;
    });
  }
};
</script>

<style scoped>
</style>
