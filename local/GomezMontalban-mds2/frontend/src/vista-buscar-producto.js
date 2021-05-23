import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaBuscarProducto extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; align-items: center; justify-content: center;" id="layoutBuscarProducto">
 <vaadin-text-field placeholder="Search" style="width: 50%; align-self: center;" id="searchField">
  <iron-icon icon="lumo:search" slot="prefix" id="ironIcon"></iron-icon>
 </vaadin-text-field>
</vaadin-horizontal-layout>
<vaadin-vertical-layout id="layoutListadoProductos" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-buscar-producto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaBuscarProducto.is, VistaBuscarProducto);
