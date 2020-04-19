<template>
  <div class id>
    <el-container style="height: 500px; border: 1px solid #eee">
      <el-aside width="200px" style="background-color: rgb(238, 241, 246)">
        <el-menu router :default-openeds="['0']">
          <el-submenu
            v-for="(item, index) in $router.options.routes"
            :index="index+''"
            :key="index"
          >
            <template slot="title">
              <i class="el-icon-menu"></i>
              {{item.name}}
            </template>
            <el-menu-item
              v-for="(item2, i) in item.children"
              :key="i"
              :index="item2.path"
              :class="$route.path==item2.path?'is-active':''"
            >{{item2.name}}</el-menu-item>
          </el-submenu>
        </el-menu>
      </el-aside>

      <el-main>
        <router-view></router-view>
      </el-main>
    </el-container>
  </div>
</template>

<script>
export default {
  name: "Index",
  data() {
    return {};
  }
};
</script>

<style scoped>
.el-header {
  background-color: #b3c0d1;
  color: #333;
  line-height: 60px;
}

.el-aside {
  color: #333;
}
</style>