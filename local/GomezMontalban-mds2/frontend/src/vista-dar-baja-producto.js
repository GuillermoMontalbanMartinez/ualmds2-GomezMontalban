import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-dar-baja-producto`
 *
 * VistaDarBajaProducto element.
 *
 * @customElement
 * @polymer
 */
class VistaDarBajaProducto extends PolymerElement {

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
        return 'vista-dar-baja-producto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaDarBajaProducto.is, VistaDarBajaProducto);
