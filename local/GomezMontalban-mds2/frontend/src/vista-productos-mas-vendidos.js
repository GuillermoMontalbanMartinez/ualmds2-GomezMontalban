import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaProductosMasVendidos extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; align-self: center; align-items: center;" id="selectLayout"></vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="layoutProductos" style="width: 100%; align-self: center; align-items: center;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-productos-mas-vendidos';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductosMasVendidos.is, VistaProductosMasVendidos);
