import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-productos-mas-vendidos`
 *
 * VistaProductosMasVendidos element.
 *
 * @customElement
 * @polymer
 */
class VistaProductosMasVendidos extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
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
